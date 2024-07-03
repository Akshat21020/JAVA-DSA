package code;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Prims_Algo {
	public Prims_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}	

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	HashMap<Integer, HashMap<Integer, Integer>> map;
	
	class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;
		public PrimsPair(int vtx,int acqvtx,int cost){
			this.vtx = vtx;
			this.acqvtx = acqvtx;
			this.cost = cost;
		}
		
		public String toString() {
			return vtx + " " + + acqvtx + " @ " + cost;
		}
		
	}
	
	public int Prims() {
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
			
		});
		HashSet<Integer> visited = new HashSet<>();
		int sum =0;
		pq.add(new PrimsPair(1,1,0));
		while(!pq.isEmpty()) {
			PrimsPair rp = pq.poll();
			if(visited.contains(rp)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			sum = sum + rp.cost;
			for(int nbrs : map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new PrimsPair(nbrs,rp.vtx,cost));
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vtx = sc.nextInt();
		int edge = sc.nextInt();
		Prims_Algo p = new Prims_Algo(vtx);
		for (int i = 0; i < edge; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			p.AddEdge(v1, v2, cost);
		}
		System.out.println(p.Prims());

	}
}
