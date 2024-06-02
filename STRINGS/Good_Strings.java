package coding;

public class Good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aeeiepdp";
		System.out.println(Max(s));
	}
	public static int Max(String s) {
		int count =0;
		int ans =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(isvowel(ch)==true) {
				count++;
			}
			else {
				ans = Math.max(ans, count);
				count =0;
			}
		}
		ans = Math.max(ans, count);
		return ans;
	}
	public static boolean isvowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
	}
}
