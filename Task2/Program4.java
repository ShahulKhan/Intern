package Task2;

public class Program4 {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,3,4,2,3};
		
		int b = 3, count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (b==a[i]) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
