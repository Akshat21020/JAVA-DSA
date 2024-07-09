package code;

import java.util.Scanner;

public class Generate_Binary_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "1??0?101";
		Binary_String(s, 0,"");
	}
	public static void Binary_String(String s,int i,String ans) {
		if(i == s.length()) {
			System.out.print(ans+" ");
			return;
		}
		if(s.charAt(i) == '?') {
			 Binary_String(s, i+1, ans+"0");
			 Binary_String(s, i+1, ans+"1");
		}
		else {
			Binary_String(s, i+1, ans+s.charAt(i));
		}
	}

}
