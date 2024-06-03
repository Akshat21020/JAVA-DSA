package coding;

public class Print_Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		Print(n);
	}
	public static void Print(int n) {
		if(n==0) {
			return;
		}
		Print(n-1);
		System.out.println(n);
	}

}
