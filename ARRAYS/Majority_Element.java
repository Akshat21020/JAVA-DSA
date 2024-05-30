package codingblocks;

import java.util.Scanner;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Majority(arr);
		}
	public static void Majority(int[] arr) {
		int idx =-1;
		int maxcount =0;
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if(count>maxcount) {
					maxcount = count;
					idx =i;
				}
			}
		}
		if(maxcount>(arr.length/2)){
			System.out.println(arr[idx]);
		}
	}

}
