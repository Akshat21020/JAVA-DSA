package coding;

public class Student1_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student1 s = new Student1();
		s.Introduce();
		//s.setName("Raj");
		//s.setAge(20);
		s.name = "Raj";
		s.age = 20;
		s.Introduce();
		s.MentorName();
		s.name = "Gupta";
		s.age = 23;
		s.Introduce();
	}

}
