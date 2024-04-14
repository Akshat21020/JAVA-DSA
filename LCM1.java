package codingblocks;
import java.util.*;
public class LCM1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dividend= sc.nextInt();
		int divisor= sc.nextInt();
		int mul = dividend*divisor;
		while(dividend%divisor!=0) {
			int rem = dividend%divisor;
			dividend = divisor;
			divisor = rem;
		}
		int lcm = mul/divisor;
		System.out.println(lcm);
	}

}
