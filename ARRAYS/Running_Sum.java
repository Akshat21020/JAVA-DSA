package codingblocks;

public class Running_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = {1,2,3,4};
		int[] ans= RunningSum(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] RunningSum(int[] arr) {
		int[] ans = new int[arr.length];
		ans[0] = 1;
		for(int i=1;i<arr.length;i++) {
			ans[i] = arr[i]+ ans[i-1];
		}
		return ans;
	}

}
