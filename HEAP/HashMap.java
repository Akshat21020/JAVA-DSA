package code;

import java.util.ArrayList;

public class HashMap<K, V> {
	
	class Node {
		K key;
		V value;
		Node next;
	}
	
	private ArrayList<Node> bucket;
	private int size=0;
	
	public HashMap() {
		this(4);
	}
	public HashMap(int n) {
		bucket = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bucket.add(null);
		}
	}
	
	public int HashFun(K key) {
		int idx = key.hashCode() % bucket.size();
		if(idx<0) {
			idx += bucket.size();
		}
		return idx;
	}
	
	public void put(K key, V value) {
		int idx = HashFun(key);
		Node temp = bucket.get(idx);
		while(temp != null) {
			if(temp.key.equals(key)) {
				temp.value = value;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = bucket.get(idx);
		nn.next = temp;
		bucket.set(idx, nn);
		size++;
		double thf = 2.0;
		double lf = (1.0*size)/bucket.size();
		if(lf > thf) {
			rehashing();
		}
	}
	
	public void rehashing() {
		ArrayList<Node> new_bucket = new ArrayList<>();
		for (int i = 0; i <2 * bucket.size(); i++) {
			new_bucket.add(null);
		}
		ArrayList<Node> ll = bucket;
		bucket = new_bucket;
		for(Node nn : ll) {
			while(nn != null) {
				put(nn.key,nn.value);
				nn = nn.next;
			}
		}
	}
	
	public boolean containsKey(K key) {
		int idx = HashFun(key);
		Node temp = bucket.get(idx);
		while(temp != null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public V get(K key) {
		int idx = HashFun(key);
		Node temp = bucket.get(idx);
		while(temp != null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}
	
	public V remove(K key) {
		int idx = HashFun(key);
		Node curr = bucket.get(idx);
		Node prev = null;
		while(curr != null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev =  curr;
			curr = curr.next;
		}
		if(curr == null) {
			return null;
		}
		else if(prev == null) {
			bucket.set(idx, curr.next);
			curr.next = null;
		}
		else {
			prev.next = curr.next;
		}
		size--;
		return curr.value;
	}
	
	public String toString() {
		String s = "{";
		for(Node nn : bucket) {
			while(nn != null) {
				s = s + nn.key + "+" + nn.value + " ";
				nn = nn.next;
			}
		}
		return s+"}";
	}
	
}
