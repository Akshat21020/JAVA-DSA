package codingblocks;

public class Rotate_Array_Using_ReverseAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=  {10,20,30,40,50,60,70};
		int k=3;
		Rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Rotate(int[] arr,int k) {
		int n = arr.length;
		Reverse(arr,0,n-k-1);
		Reverse(arr,n-k,n-1);
		Reverse(arr,0,n-1);
	}
	public static void Reverse(int[] arr,int i,int j) {
		
		while(i<j) {
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
