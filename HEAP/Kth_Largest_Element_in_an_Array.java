package code;
import java.util.*;
public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 3;
		System.out.println(Kth_Largest_Element(arr, k));
	}
	public static int Kth_Largest_Element(int[] arr,int k) {
		PriorityQueue<Integer> hp = new PriorityQueue();
		for(int i =0;i<k;i++) {
			hp.add(arr[i]);
		}
		for(int i =k;i<arr.length;i++) {
			if(arr[i]>hp.peek()) {
				hp.poll();
				hp.add(arr[i]);
			}
		}
		return hp.peek();
	}

}
