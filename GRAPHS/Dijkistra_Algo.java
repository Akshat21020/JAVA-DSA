package code;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
public class Dijkistra_Algo {
	
	HashMap<Integer,HashMap<Integer, Integer>> map;
	
	public Dijkistra_Algo(int v) {
		map = new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1,Integer v2,int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1,cost);
	}
	
	class DijkistraPair {
		int vtx;
		String acqpath;
		int cost;
		
		public DijkistraPair(int vtx,String acqvtx,int cost) {
			this.vtx = vtx;
			this.acqpath = acqvtx;
			this.cost = cost;
		}
		
		public String toString() {
			return vtx + " " + acqpath + " @ " + cost;
		}
	}
	
	public void Dijkistra(int src) {
		PriorityQueue<DijkistraPair> pq = new PriorityQueue<>(new Comparator<DijkistraPair>() {

			@Override
			public int compare(DijkistraPair o1, DijkistraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;
			}
		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkistraPair(src, "" + src,0));
		while(!pq.isEmpty()) {
			DijkistraPair rp = pq.poll();
			if(visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for(int nbrs : map.get(rp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					pq.add(new DijkistraPair(nbrs,rp.acqpath+nbrs,rp.cost+cost));
				}
			}
		}
	}
	public static void main(String[] args) {
		Dijkistra_Algo dj = new Dijkistra_Algo(7);
		dj.AddEdge(1, 2, 3);
		dj.AddEdge(1, 4, 12);
		dj.AddEdge(2, 3, 4);
		dj.AddEdge(4, 3, 2);
		dj.AddEdge(4, 5, 1);
		dj.AddEdge(6, 5, 2);
		dj.AddEdge(7, 5, 7);
		dj.AddEdge(7, 6, 4);
		dj.Dijkistra(1);
	}
}