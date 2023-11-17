package Task1;

abstract class Prg {
	
	// Abstract method
	abstract void add(int a, int b);
	
}

public class Abstraction extends Prg {
	public void add(int a, int b) {
		System.out.println("a+b = " + (a+b));
	}
	
	public static void main(String[] args) {
		
		Abstraction obj = new Abstraction();
		
		obj.add(9, 18);
		
	}

}
