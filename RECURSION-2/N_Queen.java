package coding;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] arr = new boolean[4][4];
		int tq =2 ;
		Queen(arr, tq, 0);
	}
	public static void Queen(boolean[][] arr,int tq,int row) {
		if(tq==0) {
			Display(arr);
			System.out.println();
			return;
		}
		
		for(int col=0;col<arr[0].length;col++) {
			if(isitsafe(arr,col,row)==true) {
				arr[row][col] = true;
				Queen(arr, tq-1, row+1);
				arr[row][col] = false;
			}
		}
	}
	public static boolean isitsafe(boolean[][] arr,int col,int row) {
		// up
		int r = row;
		while(r>=0) {
			if(arr[r][col]==true) {
				return false;
			}
			r--;
		}
		//left diagonal
		r = row;
		int c = col;
		while(r>=0 && c>=0) {
			if(arr[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		//right diagonal
		r = row;
		c= col;
		while(r>=0 && c<arr[0].length) {
			if(arr[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	public static void Display(boolean[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}