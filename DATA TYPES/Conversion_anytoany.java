package codingblocks;
import java.util.*;
public class Conversion_anytoany {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int sb = sc.nextInt();
	        int db = sc.nextInt();
	        int sn = sc.nextInt();
	        int ans = 0;
	        int mul=1;
	        while(sn!=0){
	            int rem=sn%10;
	            ans = ans+rem*mul;
	            mul*=sb;
	            sn/=10;
	        }
	        sn = ans;
	        int ans2=0;
	        int mul2=1;
	        while(sn!=0){
	            int rem1=sn%db;
	            ans2 = ans2+rem1*mul2;
	            mul2*=10;
	            sn=sn/db;
	        }
	        System.out.println(ans2);

	}

}
