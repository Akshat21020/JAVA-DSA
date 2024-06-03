package coding;

public class KartikBhaiya_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abaaaabaaaababaaaabbaaa";
		int k =2;
		int flipa = Flip(s,k,'a');
		int flipb = Flip(s,k,'b');
		System.out.println(Math.max(flipa, flipb));
	}
	public static int Flip(String s,int k,char ch) {
		int si=0;
		int ei= 0;
		int ans =0;
		int flip =0;
		while(ei<s.length()) {
			//grow
			if(s.charAt(ei)==ch) {
				flip++;
			}
			//shrink
			while(flip>k && si<=ei) {
				if(s.charAt(si)==ch) {
					flip--;
				}
				si++;
			}
			//ans calculate
			ans = Math.max(ans, (ei-si+1));
			ei++;
		}
		return ans;
	}

}
