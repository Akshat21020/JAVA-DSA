package coding;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aaabbcc";
		Count(s);
	}
	public static void Count(String s) {
		int count =1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
			else {
				System.out.print(s.charAt(i-1)+""+count);
				count =1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+count);
		
	}

}
