package codingblocks;
import java.util.*;
public class Square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(Root(n));
	}
	public static int Root(int n) {
		int lo =0;
		int hi = n;
		int ans =0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(Math.pow(mid,2)<=n) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}

}
