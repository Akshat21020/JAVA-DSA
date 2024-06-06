package coding;
import java.util.*;
public class Painter_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int k= in.nextInt();
		int n =in.nextInt();
		int [] arr= new int [n];
		for (int i = 0; i < arr.length; i++) {
		    arr[i]=in.nextInt();
		}
		ans(k, arr);
		    }
		    public static void ans(int k ,int []arr) {
		        int lo =1;
		        int hi=0;
		        int ans=0;
		        for (int i = 0; i < arr.length; i++) {
		            hi+=arr[i];
		        }
		        while(lo<=hi) {
		            int mid=(lo+hi)/2;
		            if(ispossible(arr,mid,k)) {
		                ans=mid;
		                hi=mid-1;
		            }else {
		            lo=mid+1;
		            }
		        }
		        System.out.println(ans);
		    }
		public static boolean ispossible(int[] arr, int mid, int k) {
		        int i=0;
		        int maxminuteofeach=0;
		        while(i<arr.length){
		            if(k==0) {
		                return false;
		            }
		            maxminuteofeach+=arr[i];
		    if(maxminuteofeach==mid) {
		        k--;
		        maxminuteofeach=0;
		    }
		       i++;
		        }
		        return true;
	}

}
