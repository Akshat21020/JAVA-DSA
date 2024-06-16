package code;

public class Client {

	public static void main(String[] args) {
		
		// CASE-1
		//P obj = new P();
		//System.out.println(obj.d);
		//System.out.println(obj.d1);
		//obj.Fun();
		//obj.Fun1();
		
		//CASE-2
		//P obj = new C();
		//System.out.println(obj.d);
		//System.out.println(obj.d1);
		//obj.Fun();
		//obj.Fun1();
		//System.out.println(((C)obj).d);
		//((C)obj).Fun2();
		
		//CASE-3
		//C obj = new P();
		
		//CASE-4
		C obj = new C();
		obj.Fun();
		obj.Fun1();
		obj.Fun2();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((P)obj).d);
	}

}
