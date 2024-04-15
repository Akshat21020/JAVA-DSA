package codingblocks;
import java.util.*;
public class SumofEVENandODD_digits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int even_sum =0;
		int odd_sum=0;
		int place=1;
		while(n!=0) {
			int rem = n%10;
			if(place%2==0) {
				even_sum += rem;
			}else {
				odd_sum +=rem;
			}
			place++;
			n/=10;
		}
		System.out.println(odd_sum);
		System.out.println(even_sum);
	}
}
