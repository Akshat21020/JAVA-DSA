package codingblocks;

import java.util.Scanner;

public class Help_Ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c1 =1;
		int c2 =3;
		int c3 =7;
		int c4 =19;
		int n = 2;
		int m =3;
		int[] rickshaw = new int[n];
		int[] cab = new int[m];
		for(int i=0;i<n;i++) {
			rickshaw[i] = sc.nextInt();
		}
		for(int i=0;i<m;i++) {
			cab[i] = sc.nextInt();
		}
		System.out.println(MinCost(c1,c2,c3,c4,rickshaw,cab));
	}
	public static int MinCost(int c1,int c2,int c3,int c4,int[] rickshaw,int[] cab) {
		int total_rickshaw = 0;
		int total_cab =0;
		for(int i=0;i<rickshaw.length;i++) {
			total_rickshaw += Math.min(rickshaw[i]*c1, c2);
		}
		total_rickshaw = Math.min(total_rickshaw, c3);
		for(int i=0;i<cab.length;i++) {
			total_cab += Math.min(cab[i]*c1, c2);
		}
		total_cab = Math.min(total_cab, c3);
		int total =0;
		total+= total_rickshaw + total_cab;
		int ans = 0;
		ans += Math.min(total, c4);
		return ans;
	}

}
