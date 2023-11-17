package Inheritance;

class F {
	void lion() {
		System.out.println("Lion");
	}
}

// Child class
class G extends F {
	void tiger() {
		System.out.println("Tiger");
	}
}

// Child class
class H extends F {
	void cat() {
		System.out.println("Cat");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		H o = new H();
		
		o.lion();
		o.cat();
	}
}
