package code;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = { 1, 3, 7, 1, 2, 5 };
		int[] num2 = { 1, 9, 2, 5, 1 };
		System.out.println(Uncrossed(num1, num2, 0, 0));
		System.out.println(UncrossedBU(num1, num2));
	}
	public static int Uncrossed(int[] num1,int[] num2,int i,int j) {
		if(i == num1.length  || j == num2.length) {
			return 0;
		}
		int ans = 0;
		if(num1[i] == num2[j]) {
			ans = 1 + Uncrossed(num1, num2, i+1, j+1);
		}
		else {
			int f = Uncrossed(num1, num2, i+1, j);
			int s = Uncrossed(num1, num2, i, j+1);
			ans =  Math.max(f, s);
		}
		return ans;
	}
	
	public static int UncrossedBU(int[] num1,int[] num2) {
		int[][] dp = new int[num1.length+1][num2.length+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(num1[i-1] == num2[j-1]) {
					dp[i][j] = 1 + dp[i-1][j-1];
				}
				else {
					int f = dp[i-1][j];
					int s = dp[i][j-1];
					dp[i][j] = Math.max(f, s);
				}
			}
		}
		return dp[dp.length-1][dp[0].length-1];
	}

}
