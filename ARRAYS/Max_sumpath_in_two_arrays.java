package codingblocks;

public class Max_sumpath_in_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,3,7,10,12,15,30,34};
		int[] arr2 = {1,5 ,7 ,8 ,10 ,15 ,16 ,19};
		System.out.println(Sum(arr1,arr2));
	}
	public static int Sum(int[] arr1,int[] arr2) {
		int i=0;
		int j=0;
		int s1 =0;
		int s2=0;
		int ans=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				s2+=arr2[j];
				j++;
			}
			else if(arr1[i]<arr2[j]){
				s1+=arr1[i];
				i++;
			}
			else {
				ans = ans +Math.max(s2, s1) + arr1[i];
				s1=0;
				s2=0;
				i++;
				j++;
			}
		}
		while(i<arr1.length) {
			s1+=arr1[i];
			i++;
		}
		while(j<arr2.length) {
			s2+=arr2[j];
			j++;
		}
		ans = ans + Math.max(s1, s2);
		return ans;
	}
}
