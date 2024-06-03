package coding;

public class Power_of_2_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b =4;
		System.out.println(Power(a,b));
	}
	public static int Power(int a,int b) {
		if(b==0) {
			return 1;
		}
		int fn = Power(a,b-1);
		return fn*a;
	}

}
