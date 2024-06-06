package coding;

public class Remove_Consecutive_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabccba";
		string(s);
	}
	public static void string(String s) {
		String ans ="";
		char ch = s.charAt(0);
		ans = ans +ch;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(i-1)) {
				ans = ans + s.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
