package code;

import java.util.Scanner;

public class Replace_pi_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n--> 0) {
			String s = sc.next();
			String ans = Replace(s);
			System.out.println(ans);
		}

	}
	public static String Replace(String s) {
		if(s.length()==0 || s.length() == 1) {
			return s;
		}
		
		if(s.charAt(0) == 'p' && s.length()>=2 &&  s.charAt(1) == 'i') {
			return "3.14" + Replace(s.substring(2, s.length()));
		}
		
		return s.charAt(0) + Replace(s.substring(1,s.length()));
	}

}
