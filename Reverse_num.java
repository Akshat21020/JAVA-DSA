package arrays1;
import java.util.*;
public class Reverse_num {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = 2345;
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
}
