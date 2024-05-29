package codingblocks;

import java.util.Arrays;

public class Target_sum_ofpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,4,2,5};
		int target =5;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
				System.out.println(arr[i]+" "+"and"+" "+arr[j]);
			}
			}
		}
	}

}
