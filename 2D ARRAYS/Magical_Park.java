package codingblocks;

public class Magical_Park {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] arr = {{'.','.','*', '.'},{'.', '#' ,'.' ,'.'},{'*', '*', '.' ,'.'},{'.', '#', '*', '*'}};
		int k = 5;
		int s = 20;
		Park(arr,k,s);
	}
	public static void Park(char[][] arr,int k,int s) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]=='.' && s>k) {
					s = s-3;
					if(j== arr[0].length-1) {
						s = s+1;
					}
				}
				else if(arr[i][j] == '*' && s>k) {
					s = s+4;
					if(j== arr[0].length-1) {
						s = s+1;
					}
				}
				else if(arr[i][j]=='#' && s>k) {
					break;
				}
			}
		}
		if(s>=k) {
			System.out.println("Yes");
			System.out.println(s);
		}else {
			System.out.println("No");
		}
	}

}
