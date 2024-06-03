package coding;

public class Print_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		Subsequence(s,"");
	}
	public static void Subsequence(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		Subsequence(ques.substring(1),ans);
		Subsequence(ques.substring(1),ans+ch);
	}
}
