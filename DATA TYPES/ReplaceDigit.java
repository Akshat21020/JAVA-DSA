package codingblocks;
import java.util.*;
public class ReplaceDigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int ans=0;
		int i=0;
		if(n==0) {
			System.out.println(5);
		}
		while(n!=0) {
			int rem = n%10;
			if(rem==0) {
				rem=5;
			}
			ans=(int) (ans+rem*Math.pow(10,i));
			i++;
			n=n/10;
		}
		System.out.println(ans);
	}

}
