package coding;

public class Search_in_Array {

	public static void main(String[] args) {
		int[] arr =  { 1, 2, 5, 4, 3, 4, 7, 4, 3, 6 };
		int item = 4;
		System.out.println(Search(arr,item,0));
	}
	public static int Search(int[] arr,int item,int idx) {
		if(arr[idx]==item) {
			return idx;
		}
		if(idx==arr.length) {
			return -1;
		}
		return Search(arr,item,idx+1);
	}
}
