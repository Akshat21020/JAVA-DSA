package code;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,9,3,1};
		System.out.println(Rob(arr, 0));
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(RobTD(arr, 0, dp));
		Arrays.fill(dp, -1);
		System.out.println(RobTD1(arr, arr.length-1, dp));
		System.out.println(RobBU(arr));
	}
	
	public static int Rob(int[] arr,int i) {
		if(i >= arr.length) {
			return 0;
		}
		int Rob = arr[i] + Rob(arr, i+2);
		int NoRob = Rob(arr, i+1);
		return Math.max(Rob, NoRob);
	}
	
	public static int RobTD(int[] arr,int i,int[] dp) {
		if(i >= arr.length) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int Rob = arr[i] + RobTD(arr, i+2,dp);
		int NoRob = RobTD(arr, i+1,dp);
		return dp[i] = Math.max(Rob, NoRob);
 	}
	
	public static int RobTD1(int[] arr,int i,int[] dp) {
		if(i < 0) {
			return 0;
		}
		if(dp[i] != -1) {
			return dp[i];
		}
		int Rob = arr[i] + RobTD1(arr, i-2,dp);
		int NoRob = RobTD1(arr, i-1,dp);
		return dp[i] = Math.max(Rob, NoRob);
	}
	
	public static int RobBU(int[] arr) {
		if(arr.length == 1) {
			return arr[0];
		}
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(arr[0], arr[1]);
		
		for(int i=2;i<dp.length;i++) {
			int rob = arr[i] + dp[i-2];
			int norob = dp[i-1];
			dp[i] = Math.max(rob, norob);
		}
		return dp[dp.length-1];
	}
}
