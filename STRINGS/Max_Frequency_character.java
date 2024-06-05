package coding;

public class Max_Frequency_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabacb";
		Major(s);
	}
	public static void Major(String s) {
		int maxcount = 0;
		int idx = -1;
		for(int i=0;i<s.length();i++) {
			int count =0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>maxcount) {
			  maxcount = count;
			  idx = i;
			}
		}
		System.out.println(s.charAt(idx));
	}

}
