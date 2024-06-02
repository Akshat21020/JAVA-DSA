package codingblocks;

public class Boolean_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,0},{0,0}};
		Boolean(arr);
	}
	public static void Boolean(int[][] arr) {
		int[] row = new int[arr.length];
		int[] col = new int[arr[0].length];
		for(int i=0;i<arr.length;i++) {
			row[i]=0;
		}
		for(int i=0;i<arr[0].length;i++) {
			col[i]=0;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==1) {
					row[i]=1;
					col[j]=1;
				}
			}		
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(row[i]==1 || col[j]==1) {
					arr[i][j]=1;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
