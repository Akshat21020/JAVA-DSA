package coding;

public class Merge_2_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 5, 7, 9, 11 };
		int[] arr2 = { 1, 2, 3, 4, 6, 7 };
		Merge(arr1, arr2);
		
	}
	public static int[] Merge(int[] arr1,int [] arr2) {
		int i =0;
		int j =0;
		int k =0;
		int m = arr1.length;
		int n = arr2.length;
		int[] ans = new int[m+n];
		while(i<m && j<n) {
			if(arr1[i]>arr2[j]) {
				ans[k] = arr2[j];
				j++;
				k++;
			}
			else {
				ans[k] = arr1[i];
				i++;
				k++;
			}
		}
		while(i<m) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		for(int a=0;a<ans.length;a++) {
			System.out.print(ans[a]+" ");
		}
		return ans;
	}

}
