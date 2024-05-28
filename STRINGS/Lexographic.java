package codingblocks;
import java.util.Scanner;

public class Lexographic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(Lexographic(s1,s2));
	}
	public static int Lexographic(String s1,String s2) {
		if(s1==s2) {
			return 0;
		}
		int l1 =s1.length();
		int l2 = s2.length();
		int l =Math.min(l1, l2);
		for(int i=0;i<l;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return l1-l2;
	}
}
