package codingblocks;
import java.util.*;
public class Inverse_of_a_num {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int place=1;
		int ans=0;
		while(n!=0) {
			int rem=n%10;
			ans = (int) (ans + place*Math.pow(10, rem-1));
			place++;
			n/=10;
		}
		System.out.println(ans);
	}

}
