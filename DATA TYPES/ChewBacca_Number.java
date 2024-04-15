package codingblocks;
import java.util.*;
public class ChewBacca_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(Chewbacca(n));
	}
	public static long Chewbacca(long n) {
		long sum =0;
		long mul=1;
		while(n>9) {
			long rem = n%10;
			if(rem>=5) {
				sum = sum+(9-rem)*mul;
			}else {
				sum = sum+rem*mul;
			}
			mul*=10;
			n/=10;
		}
		if(n==9 || n<5) {
			sum += n*mul;
		}else {
			sum+= (9-n)*mul;
		}
		return sum;
	}
}
