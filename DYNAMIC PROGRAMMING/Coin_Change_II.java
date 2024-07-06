package code;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5}; // coin
		int amount = 5; // amt;
		System.out.println(Coin(arr, amount,0));
		int[][] dp = new int[arr.length][amount+1];
		for(int[] a : dp) {
			Arrays.fill(a,-1);
		}
		System.out.println(CoinTD(arr, amount,0, dp));
	}
	public static int Coin(int[] arr,int amount,int i) {
		if(i >= arr.length) {
			return 0;
		}
		if(amount == 0) {
			return 1;
		}
		int inc = 0;
		int exc = 0;
		if(amount >= arr[i]) {
			inc = Coin(arr, amount-arr[i], i);
		}
		exc = Coin(arr, amount,i+1);
		return inc + exc;
	}
	
	public static int CoinTD(int[] arr,int amount,int i,int[][] dp) {
		if(i >= arr.length) {
			return 0;
		}
		if(amount == 0) {
			return 1;
		}
		
		if(dp[i][amount] != -1) {
			return dp[i][amount];
		}
		int inc = 0;
		int exc = 0;
		if(amount >= arr[i]) {
			inc = Coin(arr, amount-arr[i], i);
		}
		exc = Coin(arr, amount,i+1);
		return dp[i][amount] = inc + exc;
	}

}
