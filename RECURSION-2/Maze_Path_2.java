package coding;
import java.util.*;
public class Maze_Path_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1= sc.nextInt();
		int n2 = sc.nextInt();
		int[][] arr = new int[n1][n2];
		System.out.println("\n"+Path(arr, 0, 0, ""));
	}
	public static int Path(int[][] arr,int cr,int cc,String ans) {
		if(cr>arr.length || cc>arr[0].length) {
			return 0;
		}
		if(cr==arr.length-1 && cc == arr[0].length-1) {
			System.out.print(ans+" ");
			return 1;
		}
		int x=Path(arr, cr+1, cc, ans+"V");
		int y=Path(arr, cr, cc+1, ans+"H");
		int z=Path(arr, cr+1, cc+1, ans+"D");
		return x+y+z;
	}

}
