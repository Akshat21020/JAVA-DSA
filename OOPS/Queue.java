package coding;

import java.util.Iterator;

public class Queue {
	private int[] arr;
	private int front;
	private int size;
	
	public Queue() {
		arr = new int[5];
	}
	
	public Queue(int n) {
		arr = new int[n];
	}
	
	public boolean isFull() {
		return size == arr.length;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Bklol stack is full");
		}
		int idx = (size+front)%arr.length;
		arr[idx] = item;
		size++;
 	}
	
	public int Dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Bklol stack is empty");
		}
		int v = arr[front];
		front = (front+1)%arr.length;
		size--;
		return v;
	}
	
	public int GetFront() throws Exception{
		if(isEmpty()) {
			throw new Exception("Bklol stack is empty");
		}
		int v = arr[front];
		return v;
	}
	
	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx =  (front + i) % arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
}
