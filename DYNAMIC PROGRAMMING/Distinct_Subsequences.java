package code;

import java.util.Arrays;

public class Distinct_Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "rabbbit";
		String t = "rabbit";
		System.out.println(Subsequences(s, t, 0, 0));
	}
	public static int Subsequences(String s,String t,int i,int j) {
		if(j == t.length()) {
			return 1;
		}
		
		if(i == s.length()) {
			return 0;
		}

		int inc = 0;
		int exc = 0;
		
		if(s.charAt(i) == t.charAt(j)) {
			inc = Subsequences(s, t, i+1, j+1);
		}
			exc = Subsequences(s, t, i+1, j);
			
		return inc + exc;
	}

}
