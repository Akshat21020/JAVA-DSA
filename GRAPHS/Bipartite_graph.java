package code;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_graph {
	class Solution {
		public boolean isBipartite(int[][] graph) {
			Queue<BipartitePair> q = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for(int i=0;i<graph.length;i++) {
				if(visited.containsKey(i)) {
					continue;
				}
				q.add(new BipartitePair(i,0));
			}
			while(!q.isEmpty()) {
				
				BipartitePair rv = q.remove();
				
				if(visited.containsKey(rv.vtx)) {
					if(visited.get(rv.vtx)!=rv.dis) {
						return false;
					}
					else {
						continue;
					}
				}
				visited.put(rv.vtx,rv.dis);
				for(int nbrs : graph[rv.vtx]) {
					if(!visited.containsKey(nbrs)) {
						BipartitePair bp = new BipartitePair(nbrs, rv.dis+1);
					}
				}
			}
			return true;
		}
		class BipartitePair{
			int vtx;
			int dis;
			
			public BipartitePair(int vtx,int dis) {
				this.vtx = vtx;
				this.dis = dis;
			}
		}
		}
	
}
