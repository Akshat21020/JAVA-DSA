package codingblocks;
import java.util.*;
public class Print_armstrongNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		for(int i=n1;i<n2;i++) {
			int sum=0;
			int n =i;
			int a=i;
			while(n!=0) {
				int digit = n%10;
				sum = (int) (sum + Math.pow(digit,3));
				n/=10;
			}
			if(a==sum) {
				System.out.println(i);
			}
		}
	}
}
