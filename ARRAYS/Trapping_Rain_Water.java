package codingblocks;

public class Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,0,3,5};
		System.out.println(Water(arr));
	}
	public static int Water(int[] arr) {
		int n =arr.length;
		int[] left = new int[n];
		left[0] = arr[0];
		for(int i=1;i<left.length;i++) {
			left[i] = Math.max(left[i-1],arr[i]);
		}
		int[] right = new int[n];
		right[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		int sum = 0;
		for(int i=0;i<right.length;i++) {
			sum = sum + Math.min(left[i], right[i]) - arr[i];
		}
		return sum;
	}
}
