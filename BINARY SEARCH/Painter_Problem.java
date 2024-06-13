package coding;
import java.util.*;
public class Painter_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =2;
		int[] arr = {1,10};
		System.out.println(Painter(arr, k));
	}
	public static int Painter(int[] arr,int k) {
		int lo = 0;
		int hi = 0;
		for(int i=0;i<arr.length;i++) {
			hi += arr[i];
		}
		int ans =0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(arr,k,mid)==true) {
				ans = mid;
				hi = mid -1;
			}
			else {
				lo = mid +1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int[] arr,int k,int mid) {
		int i =0;
		int maxtimeofeach = 0;
		while(i<arr.length) {
			if(k==0) {
				return false;
			}
			maxtimeofeach +=arr[i];
			if(maxtimeofeach == mid) {
				k--;
				maxtimeofeach =0;
			}
			else if(maxtimeofeach>mid) {
				k--;
				maxtimeofeach =0;
				i--;
			}
			i++;
		}
		return true;
	}

}
