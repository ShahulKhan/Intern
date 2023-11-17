package Conditions;

public class ElseIf {
	
	public static void main(String[] args) {
		
		int a = 7;
		
		if (a>10) {
			System.out.println("a is greater then 10");
		}
		else if (a==10) {
			System.out.println("a is equal to 10");
		}
		else if (a>6) {
			System.out.println("a is smaller then 6");
		}
		else if (a==7) {
			System.out.println("a is equal to 7");
		}
		else {
			System.out.println("Result not found");
		}
		
	}

}
