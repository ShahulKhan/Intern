package Programs;

public class PGM3 {

	public static void main(String[] args) {
		
		String str = "a/ab/abc/abcd";
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i <= ch.length-1; i++) {
			for (int j = 0; j <= i; j++) {	
				System.out.print(ch[j]);
			}		
			System.out.println("");
		}
			
	}

}
