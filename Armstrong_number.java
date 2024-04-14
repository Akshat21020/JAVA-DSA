package codingblocks;
import java.util.*;
public class Armstrong_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int digit=0;
		int ans=0;
		int a= n;
		int m =n;
		while(n!=0) {
			int rem = n%10;
			digit++;
			n=n/10;
		}
		while(a!=0) {
			int rem1 = a%10;
			ans=(int) (ans+Math.pow(rem1, digit));
			a/=10;
		}
		if(m==ans) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
