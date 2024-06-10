package coding;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5};
		int amount = 7;
		Coin(arr, amount,"",0);
	}
	public static void Coin(int[] arr,int amount,String ans,int idx) {
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<arr.length;i++) {
			if(amount>=arr[i]) {
				amount -= arr[i];
				Coin(arr, amount, ans+arr[i],i);
				amount += arr[i];
			}
		}
	}

}
