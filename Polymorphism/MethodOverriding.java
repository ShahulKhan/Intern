package Polymorphism;

// Parent class
class i {
	public void dog() {
		System.out.println("Labrador");
	}
}

// Child class
class j extends i {
	public void dog() {
		System.out.println("German sheperd");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		j o = new j();
		
		o.dog();
	}
	
}
