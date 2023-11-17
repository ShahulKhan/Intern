package Task2;

import java.util.Arrays;
import java.util.Iterator;

public class Program5 {

	public static void main(String[] args) {
		
		short[] a = {-21,0,27,99,126};
		
		double[] b = new double[a.length];
		
		for (int i = 0; i < b.length; i++) {
			b[i] = (double) a[i];
		}
		System.out.println(Arrays.toString(b));
		
	}

}
