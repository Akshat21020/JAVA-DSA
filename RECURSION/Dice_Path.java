package coding;

public class Dice_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		Dice(n,0,"");
	}
	public static void Dice(int n,int curr,String ans) {
		if(n==curr) {
			System.out.print(ans+" ");
			return;
		}
		if(curr>n) {
			return;
		}
		Dice(n,curr+1,ans+"1");
		Dice(n,curr+2,ans+"2");
		Dice(n,curr+3,ans+"3");
	}

}
