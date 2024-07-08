package code;

import java.util.Arrays;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "FOOD";
		String t = "MONEY";
		int[][] dp = new int[s.length()][t.length()];
		for(int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Distance(s, t, 0, 0, dp));
		
	}
	public static int Distance(String s,String t,int i,int j,int[][] dp) {
		if(i == s.length()) {
			return t.length()-1;
		}
		if(j == t.length()) {
			return s.length()-1;
		}
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if(s.charAt(i) == t.charAt(j)) {
			ans = Distance(s, t, i+1, j+1,dp);
		}
		else {
			int D = Distance(s, t, i+1, j,dp);
			int I = Distance(s, t, i, j+1,dp);
			int R = Distance(s, t, i+1, j+1,dp);
			ans =Math.min(Math.min(I, R),D) + 1;
		}
		return dp[i][j] = ans;
	}

}
