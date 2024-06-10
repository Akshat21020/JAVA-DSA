package coding;
import java.util.*;
public class Rat_Chase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		char[][] arr = new char[n][m];
		for(int i=0;i<arr.length;i++) {
			String s = sc.next();
			for(int j=0;j<s.length();j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[n][m];
		Maze_Path(arr, 0, 0, ans);
	}
	public static void Maze_Path(char[][] arr,int cr,int cc,int[][] ans) {
		if(cr<0 || cc<0 || cr>arr.length || cc>arr[0].length) {
			return;
		}
		if(cr==arr.length-1 && cc==arr[0].length-1) {
			Display(ans);
			return;
		}
		arr[cr][cc] = '0';
		ans[cr][cc] = 1;
		Maze_Path(arr, cr-1, cc, ans); // up
		Maze_Path(arr, cr+1, cc, ans); // down
		Maze_Path(arr, cr, cc-1, ans); // left
		Maze_Path(arr, cr, cc+1, ans); // right
		arr[cr][cc] = 'X';
		ans[cr][cc] = 0;
	}
	public static void Display(int[][] ans) {
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}

}
