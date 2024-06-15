package coding;

public class String_Compression_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbccds";
		Compression(s);
	}
	public static void Compression(String s) {
		String hlp = "";
		int count = 1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				count++;
			}
			else {
				System.out.print(s.charAt(i-1));
				if(count>1) {
					System.out.print(count);
				}
				count = 1;
			}
		}
		System.out.print(s.charAt(s.length()-1));
		if(count>1) {
			System.out.print(count);
		}
	}

}
