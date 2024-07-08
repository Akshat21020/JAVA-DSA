package code;

import java.util.Arrays;

public class Knapsnack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cap = 4;
		int[] size = { 1, 2, 3, 2, 4 };
		int[] val =  { 8, 4, 0, 5, 3 };
		System.out.println(Knap(size, val, cap, 0));
	}
	public static int Knap(int[] size,int[] val,int cap,int i) {
		if(cap == 0 || i == size.length) {
			return 0;
		}
		int inc = 0;
		int exc =0;
		if(cap >= size[i]) {
			inc = val[i] + Knap(size, val, cap-size[i], i+1);
		}
		exc = Knap(size, val, cap, i+1);
		return inc + exc;
	}

}
