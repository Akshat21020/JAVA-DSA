package coding;

public class Count_Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		System.out.println("\n"+Path(n,0,""));
	}
	public static int Path(int n,int curr,String ans) {
		if(curr==n) {
			System.out.print(ans+" ");
			return 1;
		}
		if(curr>n) {
			return 0;
		}
		int count =0;
		for(int i=1;i<=3;i++) {
			count = count + Path(n, curr+i, ans+i);
		}
		return count;
	}

}
