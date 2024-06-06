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
		            if(ispossible(arr,mid,k)==true) {
		                ans=mid;
		                hi=mid-1;
		            }else {
		            lo=mid+1;
		            }
		        }
		        System.out.println(ans);
		    }
		    public static boolean ispossible(int[] arr, int mid, int k) {
		    	int painter = 1;
		    	int boardpaint =arr[0];
		    	for(int i=1;i<arr.length;i++) {
		    		if(boardpaint+arr[i]<=mid) {
		    			boardpaint+=arr[i];
		    		}
		    		else {
		    			painter++;
		    			boardpaint = arr[i];
		    		
		    		if(painter>k) {
		    			return false;
		    		}
		    	}
		    	
	}
		    	return true;

		    }
}
