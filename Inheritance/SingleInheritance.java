package Inheritance;

class A  {
	
	void dog() {
		System.out.println("Labrador");
	}
}

class B extends A {
	void cat() {
		System.out.println("Persian cat");
	}
}


public class SingleInheritance {
	public static void main(String[] args) {
		
		B o = new B();
		
		o.cat();
		o.dog();
	}

	private static void met() {
		// TODO Auto-generated method stub
		
	}
}
