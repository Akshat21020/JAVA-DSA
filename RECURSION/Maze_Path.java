package coding;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m =3;
		Path(n-1, m-1, 0, 0, "");
	}
	public static void Path(int er,int ec,int cr,int cc,String ans) {
		if(cr==er && cc==ec) {
			System.out.print(ans+" ");
			return;
		}
		if(cr>er || cc>ec) {
			return;
		}
		Path(er,ec,cr+1,cc,ans+"V");
		Path(er,ec,cr,cc+1,ans+"H");
	}
}
