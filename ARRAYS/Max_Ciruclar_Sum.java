package codingblocks;

public class Max_Ciruclar_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,-8,9,-9,10,-11,12};
		int maxsum=arr[0];
		int minsum =arr[0];
		int msf =arr[0];
		int minsf=arr[0];
		for(int i=1;i<arr.length;i++) {
			maxsum = Math.max(maxsum+arr[i],arr[i]);
			msf = Math.max(maxsum, msf);
			minsum = Math.min(minsum+arr[i], arr[i]);
			minsf = Math.min(minsum, minsf);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		if(minsf==sum) {
			System.out.println(msf);
		}
		System.out.println(Math.max(msf, sum-minsf));
	}

}
