package coding;
import java.util.*;
public class Longest_K_Unique_Character_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			int k =sc.nextInt();
			System.out.println(Longest(s, k));
		}
	}
	public static int Longest(String s,int k) {
		int i =0;
		int max = -1;
		while(i<s.length()) {
			int si = i;
			int uni = 0;
			int[] arr = new int[26];
			String hlp = "";
			while(si<s.length() && i<s.length() && uni<=k) {
				int idx = s.charAt(si);
				if(arr[idx-97]==0) {
					uni++;
					arr[idx-97]++;
				}
				hlp += s.charAt(si);
				if(uni==k) {
					max = Math.max(max, hlp.length());
				}
				si++;
			}
			i++;
		}
		return max;
	}
}
