package code;

public class LinkedList {
	
	class Node {
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if(size == 0) {
			head = nn;
			tail = nn;
			size++;
		}
		else {
			nn.next = head;
			head = nn;
			size++;
		}
	}
	
	public void addLast(int item) {
		if(size == 0) {
			addFirst(item);
		}
		else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			nn = tail;
			size++;
		}
	}
	
	public void addIndex(int k,int item) throws Exception {
		if(k == 0) {
			addFirst(item);
		}
		else if(k == size) {
			addLast(item);
		}
		else {
			Node nn = new Node();
			nn.val = item;
			Node prev = getNode(k-1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}
	
	public Node getNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("Bklol k is not in range");
		}
		Node temp = head;
		for (int i = 0; i < k; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public int removeFirst() {
		int val = head.val;
		if (size == 1) {
			head = null;
			tail = null;
			size--;
		}
		else {
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		return val;
	}
	
	public int removeLast() throws Exception {
		if(size == 1) {
			return removeFirst();
		}
		else {
			Node nn = getNode(size-2);
			int val = tail.val;
			tail = nn;
			tail.next = null;
			size--;
			return val;
		}
	}
	
	public int removeIndex(int k) throws Exception {
		if(k == 0) {
			return removeFirst();
		}
		else if(k == size - 1) {
			return removeLast();
		}
		else {
			Node prev = getNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}
	}
	
	public int getFirst() {
		return head.val;
	}
	
	public int getLast() {
		return tail.val;
	}
	
	public int getIndex(int k) throws Exception {
		return getNode(k).val;
	}
	
	public int size() {
		return size;
	}
	
	public void Display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+"--->");
			temp = temp.next;
		}
		System.out.print(".");
	}
}
