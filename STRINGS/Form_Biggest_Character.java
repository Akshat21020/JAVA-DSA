package coding;
import java.util.*;
public class Form_Biggest_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			Biggest(arr);
		}
	}
	public static void Biggest(int[] arr) {
		for(int turn =1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(ischeck(arr[i],arr[i+1])==true) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		String ans ="";
		for(int i=0;i<arr.length;i++) {
			ans += arr[i];
		}
		System.out.println(ans);
	}
	public static boolean ischeck(int i,int j) {
		String start = ""+i+j;
		String end  = ""+j+i;
		if(Long.parseLong(end)>Long.parseLong(start)) {
			return true;
		}
		return false;
	}

}
