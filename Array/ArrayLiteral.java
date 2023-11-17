package Array;

import java.util.Arrays;

public class ArrayLiteral {

	public static void main(String[] args) {
		
		String[] s = {"a","b","d"};
		System.out.println(s.length);
		
		s[2]="c";
		System.out.println(s[2]);
		
		System.out.println(Arrays.toString(s));
	}

}
