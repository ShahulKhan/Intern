package Programs;

import java.util.Arrays;

public class PGM2 {

	public static void main(String[] args) {
		
		String alp = "QWERTFDAYUIOPGHJKLMZNXBCV";
		
		char[] ch = alp.toCharArray();
		
		Arrays.sort(ch);	
		System.out.println(ch);
		
		for (int i = ch.length-1; i >= 0 ; i--) {
			System.out.print(ch[i]);
		}
	}

}
