package coding;
import java.util.*;
public class Palindrome_Partioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		ArrayList<String> ll = new ArrayList<>();
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		Partioning(s,ll,ans);
		System.out.println(ans);
	}
	public static void Partioning(String ques,ArrayList<String> ll,ArrayList<ArrayList<String>> ans) {
		if(ques.length()==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			 String s = ques.substring(0,i);
			if(isPalindrome(s)==true) {
				ll.add(s);
				Partioning(ques.substring(i), ll, ans);
				ll.remove(ll.size()-1);
			}
		}
	}
	public static boolean isPalindrome(String s) {
		int i= 0;
		int j = s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
