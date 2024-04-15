package codingblocks;
import java.util.*;
public class ShoppingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			int h =sc.nextInt();
			Winner(a,h);
		}
	}
	public static void Winner(int a,int h) {
		int current_amount =1;
		int ayush_current=0;
		int harsh_current=0;
		while(true) {
			ayush_current+= current_amount;
			current_amount++;
			harsh_current+= current_amount;
			current_amount++;
			
			if( ayush_current>a) {
				System.out.println("Harshit");
				break;
			}else if(harsh_current>h) {
				System.out.println("Aayush");
				break;
			}
		}
	}
}
