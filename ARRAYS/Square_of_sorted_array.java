package codingblocks;

import java.util.Arrays;

public class Square_of_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4,-1, 0, 3, 10};
		int[] ans = Square(arr);
		Arrays.sort(ans);
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] Square(int[] arr) {
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ans[i] = arr[i]*arr[i];
		}
		return ans;
	}

}
