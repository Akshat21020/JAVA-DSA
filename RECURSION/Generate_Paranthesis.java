package coding;

public class Generate_Paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		Paranthesis(n, 0, 0,"");
	}
	public static void Paranthesis(int n,int open,int close,String ans) {
		if(n==open && n==close) {
			System.out.println(ans+" ");
			return;
		}
		if(open>n || close>open) {
			return;
		}
		Paranthesis(n, open+1, close, ans+'(');
		Paranthesis(n, open, close+1, ans+')');
	}

}
