package coding;
import java.util.*;
public class Finding_cb_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "127";
		System.out.println(Count(s));
	}
	public static int Count(String s) {
		int count =0;
		boolean[] visited = new boolean[s.length()];
		for(int len=1;len<=s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				int i =j-len;
				long num = Long.parseLong(s.substring(i, j));
				if(iscbnumber(num)==true && isvisited(visited,i,j-1)==true) {
					count++;
					for(int si=i;si<j;si++) {
						visited[si] =true; //marked
					}
				}
			}
		}
		return count;
	}
	public static boolean isvisited(boolean[] visited,int i,int j) {
		for(int si=i;si<=j;si++) {
			if(visited[si]= true) {
				return false;
			}
		}
		return true;
	}
	public static boolean iscbnumber(long num) {
		if(num==0 || num==1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for(int i=0;i<arr.length;i++) {
			if(num== arr[i]) {
				return true;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}
}
