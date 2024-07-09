package code;

public class Print_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abc";
		Print(s);
	}
	public static void Print(String s) {
		int n =s.length();
		for (int i = 0; i < (1<<n); i++) {
			Pattern(s,i);
		}
	}
	
	public static void Pattern(String s,int i) {
		int pos = 0;
		while(i>0) {
			if((i & 1) != 0) {
				System.out.print(s.charAt(pos));
			}
			pos++;
			i>>=1;
		}
		System.out.println();
	}
}
