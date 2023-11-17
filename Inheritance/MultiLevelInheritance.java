package Inheritance;

//Parent class
class C {
	void lion() {
		System.out.println("Lion");
	}
}

//Child class
class D extends C {
	void tiger() {
		System.out.println("Tiger");
	}
}

//Grandchild class
class E extends D {
	void cat() {
		System.out.println("Cat");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		E o = new E();
		
		o.cat();
		o.lion();
		o.tiger();
	}
}
