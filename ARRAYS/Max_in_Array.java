package codingblocks;
public class Max_in_Array {
	public static void main(String[] args) {
		int[] arr = {3,5,1,7,8,6};
		System.out.println(Maximum(arr));
	}
	public static int Maximum(int[] arr) {
		int m = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>m) {
				m = arr[i];
			}
		}
		return m;
	}
}
