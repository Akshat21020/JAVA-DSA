package code;

public class Cars {
	int price;
	int speed;
	String colour;
	
	public Cars(int price,int speed,String colour) {
		this.price = price;
		this.speed = speed;
		this.colour = colour;
     }
	
	public String toString() {
		return "P " + price + " S " + speed + " C " + colour; 
	}
	
}
