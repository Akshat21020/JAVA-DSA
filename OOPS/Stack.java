package coding;

public class Stack {
	protected int[] arr;
	private int idx;
	
	public Stack() {
		 arr = new int[5];
	}
	
	public Stack(int n) {
		 arr = new int[n];
	}
	
	public boolean isFull() {
		return idx == arr.length;
	}
	
	public boolean isEmpty() {
		return idx == 0;
	}
	
	public int size() {
		return idx;
	}
	
	public void push(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Bklol stacks is full");
		}
		this.arr[this.idx] = item;
		this.idx++;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Bklol stacks is empty");
		}
		int v = arr[idx - 1];
		idx--;
		return v;
	}
	
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("Bklol stacks is empty");
		}
		int v = arr[idx - 1];
		return v;
	}
	
	public void Display() {
		for(int i=0;i<idx;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
