package code;
import java.util.*;
public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if((n&1) == 1) {
			System.out.println("ODD");
		}
		else {
			System.out.println("EVEN");
		}
	}

}
