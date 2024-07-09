package code;

public class Check_bit_set_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 84;
		int i = 4;
		int mask = (1 << i);
		
		if((n & mask) == 0) {
			System.out.println("UNSET");
		}
		else {
			System.out.println("SET");
		}
	}

}
