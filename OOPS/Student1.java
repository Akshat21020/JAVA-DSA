package coding;

public class Student1 {
	String name;
	int age;
	public void Introduce() {
		System.out.println("My name is "+name+" and age is "+age);
	}
	static {
		System.out.println("I am in static block of class");
	}
	public static void MentorName() {
		System.out.println("Monu Bhaiya");
	}
	static {
		System.out.println("I am in static block of class2");	
	}
}
