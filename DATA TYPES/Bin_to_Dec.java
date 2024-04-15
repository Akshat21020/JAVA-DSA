package codingblocks;
import java.util.*;
public class Bin_to_Dec {
	public static void main(String[] args) {
		int n =101101;
		int mul=1;
		int ans=0;
	    while(n!=0) {
	    	int rem = n%10;
	    	ans= ans+mul*rem;
	    	mul*=2;
	    	n/=10;
	    }
	    System.out.println(ans);
	    }
}
