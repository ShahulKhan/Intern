package Task1;

// Parent class
class Bike1 {
	public void RE() {
		System.out.println("Himalayan");
	} 
}

// Child class
class Bike2 extends Bike1 {
	public void RE() {
		System.out.println("Continental GT");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Bike1 b = new Bike1();
		b.RE();
		
		Bike2 bk = new Bike2();
		bk.RE();

	}

}
