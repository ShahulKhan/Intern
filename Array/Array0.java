package Array;

public class Array0 {
	
	public static void main(String[] args) {
		
		int[] a = new int[7];
		
		a[0]=8;
		a[6]=1;
		a[1]=9;
		a[2]=5;
		a[3]=6;
		a[4]=7;
		a[5]=3;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		for (int j : a) {
			System.out.println();
			
		}
		
	}

}
