package coding;

import java.util.ArrayList;

public class Coin_Combination_2ndway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5};
		int amount = 7;
		ArrayList<Integer> ll = new ArrayList<>();
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		Coin(arr, amount, ll, ans, 0);
		System.out.println(ans);
	}
	public static void Coin(int[] arr,int amount,ArrayList<Integer> ll,ArrayList<ArrayList<Integer>> ans,int idx) {
		if(amount==0) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			if(amount>=arr[i]) {
				ll.add(arr[i]);
				Coin(arr, amount-arr[i], ll, ans, i);
				ll.remove(ll.size()-1);
			}
		}
	}

}
