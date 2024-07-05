package code;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(Fib(n));
		System.out.println(FibTD(n));
		System.out.println(FibBU(n));
	}
	public static int Fib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int f1 = Fib(n-1);
		int f2 = Fib(n-2);
		return f1 + f2 ;
	}
	
	public static int FibTD(int n) {
		int[] dp = new int[n+1];
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n] != 0) {
			return dp[n];
		}
			
		int f1 = Fib(n-1);
		int f2 = Fib(n-2);
		return dp[n] = f1 + f2;
	}
	
	public static int FibBU(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2;i<dp.length;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
}
