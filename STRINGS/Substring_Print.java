package codingblocks;
import java.util.*;
public class Substring_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "codingblocks";
		Substring(s);
	}
	public static void Substring(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				System.out.println(s.substring(i,j));
			}
		}
	}
}
