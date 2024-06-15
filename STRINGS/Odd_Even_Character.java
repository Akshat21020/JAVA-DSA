package coding;
import java.util.*;
public class Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Oddeven(s);
    }
    public static void Oddeven(String s) {
        for(int i=0;i<s.length();i++) {
            if(i%2==0) { 
                int as = s.charAt(i)+1;
                char p = (char) as;
                System.out.print(p);
            }
            	else {
            		int as = s.charAt(i)-1;
            		 char p = (char) as;
            		 System.out.print(p);
            }
            }
	}

}
