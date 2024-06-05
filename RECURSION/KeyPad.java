package coding;

public class KeyPad {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "23";
		KeyPad(s, "");
	}
	public static void KeyPad(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = s.charAt(0);
		String press = key[ch-'0'];
		for(int i=0;i<press.length();i++){
			KeyPad(s.substring(1), ans + press.charAt(i));
		}
	}
}
