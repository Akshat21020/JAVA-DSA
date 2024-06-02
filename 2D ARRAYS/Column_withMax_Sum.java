package codingblocks;

public class Column_withMax_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4 },{5,6,7,8},{9,10,11,12}};
		MaxSum(arr);
	}
	public static void MaxSum(int[][] arr) {
		int idx =-1;
		int maxsum =0;
		for(int col=0;col<arr[0].length;col++) {
			int sum=0;
			for(int row=0;row<arr.length;row++) {
				sum += arr[row][col];
			}
			if(sum>maxsum) {
				idx = col;
			}
			maxsum = Math.max(maxsum, sum);
		}
		System.out.println(idx+1+" "+maxsum);
	}
}
