package Task1;

class Car1 {
	public void Chevrolet() {
		System.out.println("Chevrolet Camero");
	}
}

class Car2 extends Car1 {
	public void Ford() {
		System.out.println("Ford Mustang GT");
	}
}

class Car3 extends Car2 {
	public void Dodge() {
		System.out.println("Dodge Challenger");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Car3 c = new Car3();
		
		c.Chevrolet();
		c.Ford();
		c.Dodge();
		
	}

}
