package coding;

public class Person {
	String name = "Raj";
	int age = 20;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
    public void setAge(int age) {
    	try {
    		if(age<0) {
        		throw new Exception("Bklol age -ve nho ho skta");
        	}
    		this.age = age;
    	}
    	catch(Exception e) {
			e.printStackTrace();
		}
    	finally {
    		System.out.println("I am finaly blocks");
    	}
    }   
    public String getName() {
    	return name;
    }
    public int getAge(){
    	return age;
    }
    //public void setAge(int age) throws Exception {
    //	if(age<0) {
    //		throw new Exception("Bklol age -ve nho ho skta");
    //	}
    //	this.age  = age;
    //}
}
