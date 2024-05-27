package codingblocks;

public class Book_Allocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40};
		int nos = 2;
		System.out.println(MaximumPages(arr,nos));
	}
	public static int MaximumPages(int[] arr,int nos) {
		int lo = 0;
		int hi =0;
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			hi = hi+ arr[i];
		}
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitPossible(arr,nos,mid)==true) {
				ans = mid;
				hi = mid-1;
			}else {
				lo = mid +1;
			}
		}
		return ans;
	}
	public static boolean isitPossible(int[] arr,int nos,int mid) {
		int student = 1;
		int readpage = 0;
		for(int i=0;i<arr.length;) {
			if(readpage+arr[i]<=mid) {
				readpage+= arr[i];
				i++;
			}else {
				student++;
				readpage=0;
			}
			if(student>nos) {
				return false;
			}
		}
		return true;
	}

}
