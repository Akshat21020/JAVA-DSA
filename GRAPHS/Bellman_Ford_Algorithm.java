package code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Bellman_Ford_Algorithm {
	HashMap<Integer,HashMap<Integer, Integer>> map;
	
	public Bellman_Ford_Algorithm(int v) {
		map = new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i,new HashMap<>());
		}
	}
	public void AddEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2, cost);
	}
	
	class EdgePair {
		int e1;
		int e2;
		int cost;
		
		public EdgePair(int e1, int e2 ,int cost) {
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;
	     }
		
		public String toString() {
			return e1+" " + e2+" "+ " @ " + cost;
		}
	}
	
	public List<EdgePair> getAllEdges() {
		List<EdgePair> ll = new ArrayList<>();
		for(int e1 : map.keySet()) {
			for(int e2 : map.get(e1).keySet()) {
				int cost = map.get(e1).get(e2);
				ll.add(new EdgePair(e1 , e2 ,cost));
			}
		}
		return ll;
	}
	
	public void Bellman() {
		int v = map.size();
		int[] dis = new int[v+1];
		for(int i=2;i<dis.length;i++) {
			dis[i] = 8678676;
		}
		List<EdgePair> ll = getAllEdges();
		
		for(int i=1;i<=v;i++) {
			for(EdgePair e : ll) {
				if(i == v && dis[e.e2]>dis[e.e1]+e.cost) {
					System.out.println("-ve weight ka cycle hai");
					return;
				}
				if(dis[e.e2]>dis[e.e1]+e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}
			}
		}
		for(int i=1;i<dis.length;i++) {
			System.out.print(dis[i]+" ");
		}
	}
	public static void main(String[] args) {
		Bellman_Ford_Algorithm  bf = new Bellman_Ford_Algorithm (5);
		bf.AddEdge(1, 2, 8);
		bf.AddEdge(1, 3, 4);
		bf.AddEdge(1, 4, 5);
		bf.AddEdge(2, 5, 2);
	    //bf.AddEdge(2, 5, -2);
		bf.AddEdge(5, 2, 1);
		bf.AddEdge(3, 4, -3);
		bf.AddEdge(4, 5, 4);
		bf.Bellman();

	}

}
