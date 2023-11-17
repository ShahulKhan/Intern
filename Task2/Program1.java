package Task2;

import java.util.Arrays;

public class Program1 {

	public static void main(String[] args) {
		
		int[] num = new int[7];
		
		num[0] = 11;
		num[1] = 98;
		num[2] = 45;
		num[3] = 74;
		num[4] = 27;
		num[5] = 70;
		num[6] = 57;
		
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(num));
		
		Arrays.sort(num);
		
		System.out.println("");
		
		// Ascending order
		System.out.println("Ascending order");
		System.out.println(Arrays.toString(num));
		
		System.out.println("");
		
		for (int i = num.length-1; i >= 0; i--) {
			// Descending order
			System.out.print(num[i] + " ");
		}
		
		System.out.println("");
		
		System.out.print("Minimum value = " + num[0]);
		
		System.out.println("");
		
		System.out.println("Maximum value = " + num[6]);
		
	}

}
