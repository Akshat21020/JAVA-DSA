package codingblocks;

public class Substring_Print_Otherway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "code";
		Substring(s);
	}
	public static void Substring(String s) {
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i = j - len;
				System.out.println(s.substring(i, j));
			}
		}

	}

}
