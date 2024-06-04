package coding;

import java.util.Scanner;

public class Count_Palindromic_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Substring(s));
	}
	public static int Substring(String s) {
		int count =0;
		for(int i=0;i<=s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(isPalindrome(s,i,j-1)==true) {
					count++;
				}
			}
		}
		return count;
	}
	public static boolean isPalindrome(String s,int i,int j) {
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
