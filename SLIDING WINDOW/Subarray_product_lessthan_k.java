package coding;

public class Subarray_product_lessthan_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={ 10, 5, 2, 6 };
		int k =100;
		System.out.println(Product(arr,k));
	}
	public static int Product(int[] arr,int k) {
		int si=0;
		int ei =0;
		int p =1;
		int count =0;
		while(ei<arr.length) {
			//grow
			p = p*arr[ei];
			while(p>=k && si<=ei) {
				//shrink 
				p = p/arr[si];
				si++;
			}
			//ans calculate
			count = count + (ei-si+1);
			ei++;
		}
		return count;
	}

}
