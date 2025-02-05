package code;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Undirected_Graph {
	HashMap<Integer, HashMap<Integer,Integer>> map;
	public Undirected_Graph(int v) {
		map = new HashMap<>();
		for (int i = 1; i <=v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1,cost);
	}
		
	public void AddVertex(int v) {
		map.put(v, new HashMap<>());
	}
		
	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2);
	}
	
	public boolean ContainsVertex(int v) {
		return map.containsKey(v);
	}
	
	public int noofedge() {
		int sum = 0;
		for(int vtx : map.keySet()) {
			sum = sum + map.get(vtx).size();
		}
		return sum/2;
	}
	
	public void RemoveEdge(int v1,int v2) {
		 map.get(v1).remove(v2);
		 map.get(v2).remove(v1);
	}
	
	public void RemoveVertex(int v1) {
		for(int nbrs : map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
		map.remove(v1);
	}
	
	public void display() {
		for(int vtx : map.keySet()) {
			System.out.println(vtx+" "+map.get(vtx));
		}
	}
	
	public boolean hasPath(int src, int des, HashSet<Integer> visited) {
		if(src == des) {
			return true;
		}
		visited.add(src);
		for(int nbrs : map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				boolean ans = hasPath(nbrs, des, visited);
				if (ans) {
					return ans;
				}
			}
		}
		return false;
	}
	
	public void PrintPath(int src,int des,HashSet<Integer> visited,String ans) {
		if(src == des) {
			System.out.println(ans + des);
			return;
		}
		visited.add(src);
		for(int nbrs : map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				PrintPath(nbrs, des, visited, ans + src);
			}
		}
		visited.remove(src);
	}
	
	public boolean BFS(int src,int des) {
		Queue<Integer> q = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		q.add(src);
		while(!q.isEmpty()) {
		// 1. remove
		int rv = q.remove();
		// 2. ignore
		if(visited.contains(rv)) {
			continue;
		}
		// 3. visited
		visited.add(rv);
		// 4. Self work
		if(rv == des) {
			return true;
		}
		// 5. add nbrs unvisited
		for(int nbrs : map.get(rv).keySet()) {
			if(!visited.contains(nbrs)) {
				q.add(nbrs);
			}
		  }
		}
		return false;
	}
	
	public boolean DFS(int src,int des) {
		Stack<Integer> st = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		st.push(src);
		while(!st.isEmpty()) {
		// 1. remove
		int rv = st.pop();
		// 2. ignore
		if(visited.contains(rv)) {
			continue;
		}
		// 3. visited
		visited.add(rv);
		// 4. Self work
		if(rv == des) {
			return true;
		}
		// 5. add nbrs unvisited
		for(int nbrs : map.get(rv).keySet()) {
			if(!visited.contains(nbrs)) {
				st.push(nbrs);
			}
		}
		}
		return false;
	}
}
