package coding;

public class Lexographic_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =100;
		Counting(n, 0);
	}
	public static void Counting(int n,int curr) {
		if(curr>n) {
			return;
		}
		System.out.println(curr+" ");
		int i =0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			Counting(n, curr*10+i);
		}
	}

}