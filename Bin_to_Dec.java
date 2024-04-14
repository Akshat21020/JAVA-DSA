package arrays1;
import java.util.*;
public class Bin_to_Dec {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int n = 101101;
		int ans =0;
		int mul=1;
		while(n!=0) {
			int rem = n%10;
			ans=ans+rem*mul;
			mul*=2;
			n/=10;
		}
		System.out.println(ans);
	}
}
