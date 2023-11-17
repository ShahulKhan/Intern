package Programs;

import java.util.Arrays;

import Loop.For;

public class JavaProgram {
	
	public static void main(String[] args) {
		
		String alp = "QWERTYUIOPASDFGHJKLZXCVBNM";
		
		char[] charArray = alp.toCharArray();
		
		Arrays.sort(charArray);
		
		System.out.println(charArray);
		
		for (int i = charArray.length-1; i > 0; i--) {
			System.out.print(charArray[i]);
		}
		
	}

}
