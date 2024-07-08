package code;

import java.util.Arrays;

public class Min_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int[][] dp = new int[arr.length][arr[0].length];
		for(int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Sum(arr, 0, 0,dp));
	}
	
	public static int Sum(int[][] arr,int cr,int cc,int[][] dp) {
		if(cr >= arr.length || cc >= arr[0].length) {
			return Integer.MAX_VALUE;
		}
		if(cr == arr.length-1 && cc == arr[0].length-1) {
			return arr[cr][cc];
		}
		if(dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		int down =  Sum(arr, cr+1, cc,dp);
		int right = Sum(arr, cr, cc+1,dp);
		return dp[cr][cc] = Math.min(right, down) + arr[cr][cc];
	}
}
