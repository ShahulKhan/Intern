package Task1;

interface Program0 {
	
	public void mul(int a, int b);
	
	public void div(int a, int b);
	
}

public class Program1 {

	public void mul(int a, int b) {
		System.out.println((a*b));
	}
	
	public void div(int a, int b) {
		System.out.println((a/b));
	}
	
	public static void main(String[] args) {
		
		Program1 myPro = new Program1();
		
		myPro.mul(3, 4);
		myPro.div(4, 2);
	}

}
