package codingblocks;

import java.util.Arrays;

public class Sort_Row_wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{13 ,5 ,13 ,9 ,11 },{5 ,10 ,11, 4 ,6 },{6, 10, 17, 12, 16 },{8 ,11, 7 ,18 ,5 }};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void Sort(int[][] arr) {
		for(int r=0;r<arr.length;r++) {
			Arrays.sort(arr[r]);
		}
	}

}
