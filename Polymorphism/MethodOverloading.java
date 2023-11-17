package Polymorphism;

public class MethodOverloading {
	
	public void add(int a) {
		System.out.println(a+1);
	}
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
public static void main(String[] args) {
	
	MethodOverloading o = new MethodOverloading();
	
	o.add(10);
	o.add(1, 4);
	o.add(1, 5, 7);
}

}
