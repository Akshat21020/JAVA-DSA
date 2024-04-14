package codingblocks;
import java.util.*;
public class Print_Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int term=1;
		int i=1;
		while(term<=n1) {
			int n= (3*i)+2;
			if(n%n2!=0) {
				System.out.println(n);
				term++;
			}
			i++;
		}
	}
}
