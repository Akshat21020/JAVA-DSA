package code;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,15,20,2};
		int f = Stairs(arr, 0);
		int s = Stairs(arr, 1);
		System.out.println(Math.min(f, s));
		System.out.println(StairsBU(arr));
	}
	
	public static int Stairs(int[] arr,int i) {
		if(i >= arr.length) {
			return 0;
		}
		int f = Stairs(arr, i+1);
		int s = Stairs(arr, i+2);
		return arr[i]+Math.min(f, s);
	}
	
	public static int StairsBU(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = arr[1];
		
		for(int i=2;i<dp.length;i++) {
			int f = dp[i-1];
			int s = dp[i-2];
			dp[i] = arr[i] + Math.min(f, s);
		}
		return Math.min(dp[dp.length-1], dp[dp.length-2]);
	}

}
