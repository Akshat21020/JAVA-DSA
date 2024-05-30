package codingblocks;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				 arr[i] =sc.nextInt();
			}
			Arrays.sort(arr);
			int target = sc.nextInt();
			Roses(arr,target);
		}
		}
	public static void Roses(int[] arr,int target) {
		int min = Integer.MAX_VALUE;
		int diff =0;
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<arr.length;k++) {
				while(arr[j]+arr[k]==target && arr[j]>=arr[k] && j!=k ) {
				 diff = arr[j] - arr[k];
				 min = Math.min(diff, min);
				 if(diff==min) {
					 System.out.println( "Deepak should buy roses whose prices are"+" "+arr[j]+" "+"and"+" "+arr[k]+".");
					 return;
				 }
				}
			}
		}
	}

}
