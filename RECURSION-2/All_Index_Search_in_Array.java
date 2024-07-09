package code;

import java.util.ArrayList;
import java.util.Scanner;

public class All_Index_Search_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		ArrayList<Integer> ans = new ArrayList<>();
		Search(arr, m, 0, ans);
		Integer[] ll = new Integer[ans.size()];
		ll = ans.toArray(ll);
		for(Integer x : ll) {
			System.out.print(x+" ");
		}
	}
	public static ArrayList<Integer> Search(int[] arr,int m,int idx,ArrayList<Integer> ans) {
		if(idx == arr.length) {
			
			return ans;
		}
		if(arr[idx] == m) {
			ans.add(idx);
		}
		return Search(arr, m, idx+1, ans);
		
	}
}
