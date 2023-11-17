package Task2;

import java.util.Arrays;

public class Program3 {

	public static void main(String[] args) {
		
		int a[] = {11,44,22,33,55,77,88,99,66};
		
		int[] b = {12,77,23,90,34,56,67,89,45};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(b[j]);
				}
			}
		}

	}

}
