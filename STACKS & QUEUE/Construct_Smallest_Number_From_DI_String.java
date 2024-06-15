package code;
import java.util.*;
public class Construct_Smallest_Number_From_DI_String {
	
	public static void main(String[] args) {
		String s  = "IIIDIDDD";
		System.out.println(DIstring(s));
	}
	public static String DIstring(String s) {
		int c = 1;
		int[] ans = new int[s.length()+1];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<=s.length();i++) {
			if(i == s.length() || s.charAt(i) == 'I') {
				ans[i] =  c;
				c++;
				while(!st.isEmpty()) {
					ans[st.pop()] = c;
					c++;
				}
			}
			else {
				st.push(i);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ans.length;i++) {
			sb.append(ans[i]);
		}
		return sb.toString();
	}
}
