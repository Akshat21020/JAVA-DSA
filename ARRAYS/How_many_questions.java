package codingblocks;

import java.util.Scanner;

public class How_many_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a =10;
		int[] arr = new int[3];
		int ques=0;
		for(int i=0;i<a;i++) {
			int count =0;
			for(int j=0;j<arr.length;j++) {
				arr[j] = sc.nextInt();
				if(arr[j]==1) {
					count++;
				}
			}
			if(count>=2) {
				ques++;
			}
		}
		System.out.println(ques);
	}

}
