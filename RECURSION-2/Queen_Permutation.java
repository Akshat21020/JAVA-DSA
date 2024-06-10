package coding;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] arr = new boolean[4];
		int tq = 2;
		Queen(arr, tq, "",0);
	}
	public static void Queen(boolean[] arr,int tq,String ans,int qpsf) {
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==false) {
			arr[i] = true;
			Queen(arr, tq, ans+"b"+i+"q"+qpsf, qpsf+1);
			arr[i] = false; // undo(BACKTRACKING)
			}
		}
	}
}
