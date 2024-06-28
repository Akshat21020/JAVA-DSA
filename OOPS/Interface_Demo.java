package code;

public interface Interface_Demo {
	public void push(int item);

	public int pop();

	public int peek();

	public void f();

	int val = 9;

// java8
	public static void fun() {

	}

	default void display() {
		fun2();
	}

	// java 9
	private void fun2() {

	}

	private static void fun3() {

	}
}
