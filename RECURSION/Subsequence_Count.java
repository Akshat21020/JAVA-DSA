package coding;

public class Subsequence_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abc";
		System.out.println("\n"+Count(s, ""));
	}
	public static int Count(String s,String ans) {
		if(s.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch = s.charAt(0);
		int x = Count(s.substring(1), ans);
		int y = Count(s.substring(1), ans+ch);
		return x+y;
	}

}
