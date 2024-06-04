package coding;

public class Permutation_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abac";
		Permutation(s, "");
	}
	public static void Permutation(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for(int i=0;i<s.length();i++) {
			int val =0;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					val =1;
					break;
				}
			}
			if(val==0) {
				    char ch= s.charAt(i);
					String s1 = s.substring(0, i);
					String s2 = s.substring(i+1);
					Permutation(s1+s2,ans+ch);
			}
		}
	}

}
