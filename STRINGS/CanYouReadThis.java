package coding;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s ="IAmACompetitiveProgrammer";
		CamelCase(s);
	}
		public static void CamelCase(String s) {
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.println();
				
		}
			System.out.print(s.charAt(i));
	   }
	}
}