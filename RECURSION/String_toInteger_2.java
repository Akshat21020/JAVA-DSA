package code;

import java.util.Scanner;

public class String_toInteger_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "12345";
		System.out.println(Int(s, 0, 0));
	}
	public static int Int(String s,int idx,int num) {
		if(idx == s.length()) {
			return num;
		}
		num = num*10 + (s.charAt(idx) - '0');
		return Int(s,idx+1,num);
	}

}
