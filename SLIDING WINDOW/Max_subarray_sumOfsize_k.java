package coding;

public class Max_subarray_sumOfsize_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = { 2, 3, 4, 1, 2, 3, 7, 6, 8, 2, 3 };
	    int k = 3;
	    System.out.println(Max_Sum(arr,k));
	}
	public static int Max_Sum(int[] arr,int k) {
		int sum =0;
		// 1st Window
		for(int i=0;i<k;i++) {
			sum = sum + arr[i];
		}
		int ans = sum;
		for(int i=k;i<arr.length;i++) {
			//grow
			sum = sum + arr[i];
			//shrink
			sum = sum - arr[i-k];
			//ans calculate
			ans = Math.max(ans, sum);
		}
		return ans;
	}
}
