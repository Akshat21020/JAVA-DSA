package codingblocks;

public class Vom_Neuman_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {101,1111,00110,111111};
		for(int i=0;i<arr.length;i++) {
			int mul =1;
			int ans=0;
			while(arr[i]>0) {
				int rem = arr[i]%10;
				ans = ans+rem*mul;
				mul*=2;
				arr[i]/=10;
			}
			System.out.println(ans);
		}
	}

}
