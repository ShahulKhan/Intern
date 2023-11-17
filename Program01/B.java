package Program01;

// Parent class
abstract class A {
	
	abstract void Boy1();
	
	void Boy2() {
		System.out.println("Boy2");
	}
}

// Child class
public class B extends A{
	
	public void Boy1() {
		System.out.println("Boy1");
	}
	
	public static void main(String[] args) {
		
		A obj = new B();
		
		obj.Boy1();
		obj.Boy2();
		
	}
}


	
	
