package coding;
import java.util.*;
public class Non_Repeating_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "codingblocks";
		ncr(s);
		
	}
	public static void ncr(String s) {
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++) {
			int idx = (int)(s.charAt(i));
			idx = idx - 97;
			arr[idx]++;
		}
		for(int i=0;i<s.length();i++) {
			int idx = (int)(s.charAt(i));
			if(arr[idx-97]==1) {
				System.out.println(s.charAt(i));
				return;
			}
		}
		System.out.println(-1);
	}

}
