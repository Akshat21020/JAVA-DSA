package coding;

public class Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abC";
		Toggle(s);
	}
	public static void Toggle(String s) {
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			}
			else {
				ch = Character.toUpperCase(ch);
			}
			System.out.print(ch);
		}
	}

}
