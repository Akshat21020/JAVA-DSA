package code;
import java.util.*;
public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =  { 30, 35, 40, 38, 35 };
		Stock(arr);
	}
	public static void Stock(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(!st.isEmpty()) {
				ans[i] = i - st.peek();
			}
			else {
				ans[i] = i + 1;
			}
			st.push(i);
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i]+" "+ans[i]);
		}
	}
}
