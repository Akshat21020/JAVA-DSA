package codingblocks;
import java.util.*;
public class Alex_goes_shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {100,200,400,100};
		int q =6;
		while(q-->0) {
		int money = sc.nextInt();
		int k =sc.nextInt();
		Items(arr,money,k);
		}
	}
	public static void Items(int[] arr,int money,int k) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(money%arr[i]==0) {
				count++;
			}
		}
		if(count>=k) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
}
