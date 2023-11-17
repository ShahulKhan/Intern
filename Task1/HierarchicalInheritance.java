package Task1;

class Vehicle {
	public void Campervan() {
		System.out.println("Campervan");
	}
}

class Campervan1 extends Vehicle {
	public void force() {
		System.out.println("Force Traveller");
	}
}


class Campervan2 extends Vehicle {
	public void tata() {
		System.out.println("Tata Winger");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Campervan1 van1 = new Campervan1();
		van1.Campervan();
		van1.force();
		
		System.out.println("");
		
		Campervan2 van2 = new Campervan2();
		van2.Campervan();
		van2.tata();
		
	}

}
