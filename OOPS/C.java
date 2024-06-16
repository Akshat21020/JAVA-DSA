package code;

public class C extends P {
	int d = 2;
	int d2 = 20;
	@Override
	public void Fun() {
		super.Fun();//P
		System.out.println("Fun in C");
	}
	
	public void Fun2() {
		System.out.println("Fun2 in C");
	}
}
