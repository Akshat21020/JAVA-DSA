package arrays1;
import java.util.Scanner;
public class Dec_to_Bin {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = 43;
			int ans=0;
			int mul=1;
			while(n!=0) {
				int rem=n%2;
				ans =ans+ rem*mul; 
				mul =mul*10;
				n=n/2;
			}
			System.out.println(ans);
		}
}
