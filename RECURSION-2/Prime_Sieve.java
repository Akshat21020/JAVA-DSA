package coding;

public class Prime_Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =100;
		System.out.println(Prime(n));
	}
	public static int Prime(int n) {
		int[] arr = new int[n+1];
		arr[0] = 1; // 0 mtlb prime hai
		arr[1] = 1; // 1 mtlb prime nhi hai
		for(int i=2;i * i<=n;i++) {
			if(arr[i]==0) {
			for(int j=2;j * i<=n;j++) {
				arr[i * j] = 1;
			}
			}
		}
		int count = 0;
		for(int i=2;i<arr.length;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		return count;
	}

}
