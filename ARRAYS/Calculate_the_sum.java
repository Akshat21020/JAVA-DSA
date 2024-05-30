package codingblocks;
import java.util.*;
public class Calculate_the_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int[] temp = {1,2,3,4,5};
		int q = 2;
		while(q-->0) {
			int p = sc.nextInt();
			for(int i =0;i<arr.length;i++) {
				int r = i-p;
				if(r<0) {
					r = arr.length+r;
				}
				arr[i] = arr[i] + temp[r];
			}
			for(int i=0;i<arr.length;i++) {
				temp[i] = arr[i];
			} 
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
