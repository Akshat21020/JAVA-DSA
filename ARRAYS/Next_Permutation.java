package codingblocks;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3};
		Permutation(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Permutation(int[] arr) {
		int p=-1;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i-1]<arr[i]) {
				p = i-1;
				break;
			}
		}
		if(p==-1) {
			p =0;
			reverse(arr,p,arr.length-1);
			return;
		}
		for(int i=arr.length-1;i>p;i--) {
			if(arr[i]>arr[p]) {
			int temp = arr[p];
			arr[p] = arr[i];
			arr[i] = temp;
			break;
			}
			
		}
		reverse(arr,p+1,arr.length-1);
	}
	public static void reverse(int[] arr,int si,int ei) {
		 while(si<=ei) {
			 int temp = arr[si];
			 arr[si] = arr[ei];
			 arr[ei] = temp;
			 si++;
			 ei--;
		 }
	}

}
