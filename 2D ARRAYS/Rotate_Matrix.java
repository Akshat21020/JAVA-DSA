package codingblocks;

public class Rotate_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		Rotate(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void Rotate(int[][] arr) {
		//Transpose
		for(int i=0;i<arr.length;i++) {	
			for(int j=i+1;j<arr[0].length;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i]= temp;
			}
		}
		//Rotation
		for(int c=0;c<arr[0].length;c++) {
			int i =0;
			int j= arr.length-1;
			while(i<=j) {
				int temp= arr[i][c];
				arr[i][c] = arr[j][c];
				arr[j][c]=temp;
				i++;
				j--;
			}
		}
	}

}
