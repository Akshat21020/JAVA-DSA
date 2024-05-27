package codingblocks;

import java.util.Arrays;

public class Aggresive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,8,4,9};
		int nos = 3;
		Arrays.sort(arr);
		System.out.println(MinimumDistance(arr,nos));
		}
	public static int MinimumDistance(int[] arr,int nos) {
		int lo =0;
		int hi =arr[arr.length-1] - arr[0];
		int ans = 0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitPossible(arr,mid,nos)==true) {
				ans = mid;
				lo = mid+1;
			}else {
				hi = mid -1;
			}
		}
		return ans;
	}
	public static boolean isitPossible(int[] arr,int mid,int nos) {
		int cow  = 1;
		int pos = arr[0];
		for(int i =1;i<arr.length;i++) {
			if(arr[i]-pos>=mid) {
				pos = arr[i];
				cow++;
			}
			if(cow==nos) {
				return true;
			}
		}
		return false;
	}
}
