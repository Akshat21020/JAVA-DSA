package coding;

import java.util.Scanner;

public class Diff_in_ASCII_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s ="acb";
		Difference(s);
	}
	public static void Difference(String s) {
		
		for(int i=0;i<s.length()-1;i++) {
			char ch = s.charAt(i);
			int diff = s.charAt(i+1) - s.charAt(i);
			System.out.print(ch+""+diff);
		}
		System.out.print(s.charAt(s.length()-1));
	}

}
