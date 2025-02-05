package code;

import java.util.Arrays;

public class Valentine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] boys = {2, 11 ,3};
		int[] girls = {5 ,7, 3, 2};
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(Valentine(boys, girls, 0, 0));
	}
	
	public static int Valentine(int[] boys,int[] girls,int i,int j) {
		if(i == boys.length) {
			return 0;
		}
		if(j == girls.length) {
			return 10000000;
		}
		int pick = Math.abs(boys[i]-girls[j]) + Valentine(boys, girls, i+1, j+1);
		int nopick = Valentine(boys, girls, i, j+1);
		return Math.min(pick, nopick);
	}
}
