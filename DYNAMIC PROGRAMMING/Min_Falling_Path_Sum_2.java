package code;

import java.util.Arrays;

public class Min_Falling_Path_Sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr =  { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for(int[] a : dp) {
			Arrays.fill(a, -1000000);
		}
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<arr[0].length;i++) {
			ans = Math.min(ans, Sum(arr, 0, i, dp));
		}
		System.out.println(ans);
	}
	
	public static int Sum(int[][] arr,int cr,int cc,int[][] dp) {
		if(cr == arr.length-1) {
			return arr[cr][cc];
		}
		if(dp[cr][cc] != -1000000) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for(int col = 0;col<dp.length;col++) {
			if(col != cc) {
				ans = Math.min(ans, Sum(arr, cr+1, col, dp));
			}
		}
		return dp[cr][cc] = ans + arr[cr][cc]; 
	}
}
