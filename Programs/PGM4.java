package Programs;

public class PGM4 {

	public static void main(String[] args) {
		
		String str = "a/ab/abc/abcd/abcde ";
		
		String[] split = str.split("/");
		
		for (int i = 0; i < split.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(split[j]);
				if (j<i) {
					System.out.print("/");
				}
			}
			System.out.println("");	
		}
		

	}

}
