package codingblocks;
import java.util.*;
public class Check_pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(Pallindrome(s1));
	}
	public static boolean Pallindrome(String s1) {
		int i=0;
		int j =s1.length()-1;
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
