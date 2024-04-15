package codingblocks;
import java.util.*;
public class BostonNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(isBostonNum(n));
	}
	public static int sumofdigits(int n) {
		int sum=0;
		while(n!=0) {
			int digit = n%10;
			sum = sum + digit;
			n/=10;
		}
		return sum;
	}
	public static int isBostonNum(int n) {
		int digit = sumofdigits(n);
		int pf=0;
		int div=2;
		while(div<=n) {
			int rem = n%div;
			if(rem==0) {
				pf = pf + sumofdigits(div);
				n/=div;
			}else {
				div++;
			}
		}
		if(pf==digit) {
			return 1;
		}else {
			return 0;
		}
	}
}
