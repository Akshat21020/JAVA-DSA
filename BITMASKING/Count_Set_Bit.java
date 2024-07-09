package code;

public class Count_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		System.out.println(Count(n));
	}
	public static int Count(int n) {
		int c = 0;
		while(n>0) {
			if((n & 1) != 0) {
				c++;
			}
			n = n>>1;
		}
		return c;
	}

}
