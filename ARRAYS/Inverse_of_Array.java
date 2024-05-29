package codingblocks;

public class Inverse_of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,4,1,3};
		int[] ans = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ans[arr[i]] = i;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
}
