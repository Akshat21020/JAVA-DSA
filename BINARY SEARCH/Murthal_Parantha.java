package codingblocks;

public class Murthal_Parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 10;
		int l = 4;
		int[] arr = {1,2,3,4};
		System.out.println(ans(arr,p));
	}
	public static int ans(int[] arr,int p) {
		int max =0;
		for(int i=1;i<=p;i++) {
			max = max +i*arr[arr.length-1];
		}
		int lo =0;
		int hi = max;
		int ans=0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(ischeck(arr,p,mid)==true) {
				ans = mid;
				hi = mid-1;
			}
			else {
				lo = mid+1;
			}
		}
		return ans;
	}
	public static boolean ischeck(int[] arr,int p,int mid) {
		int i =0;
		int cp =0;
		int maxtime = mid;
		while(i<arr.length) {
			int eachcooktime =0;
			int j = 1;
			while(eachcooktime<=maxtime && cp!=p) {
				eachcooktime = eachcooktime + j*arr[i];
				if(eachcooktime<=maxtime) {
					cp++;
				}
				j++;
			}
			i++;
		}
		if(cp==p) {
			return true;
		}
		return false;
	}

}
