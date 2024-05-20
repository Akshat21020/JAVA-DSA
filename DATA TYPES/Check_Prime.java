package codingblocks;
import java.util.*;
public class Check_Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1 || n==0) {
			System.out.println("none");;
		}
		if(n>1) {
		int count =0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}
		}
	}

}
