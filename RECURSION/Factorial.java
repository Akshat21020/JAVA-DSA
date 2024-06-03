package coding;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Factorial(n));
	}
	public static int Factorial(int n) {
		if(n==0) {
			return 1;
		}
		int fn = Factorial(n-1);
		return fn * n;
	}

}
