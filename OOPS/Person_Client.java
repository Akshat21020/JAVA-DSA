package coding;

public class Person_Client {

	public static void main(String[] args) { //throws Exception  
		// TODO Auto-generated method stub
		Person p = new Person("Ankit",20);
		System.out.println(p.name);
		System.out.println(p.age);
		p.setAge(-9);
		p.setName("Raj");
		p.getAge();
		p.getName();
	}

}
