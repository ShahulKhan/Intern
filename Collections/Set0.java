package Collections;

import java.util.Set;
import java.util.HashSet;

public class Set0 {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<> ();
		
		s.add(10);
		s.add(50);
		s.add(50);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(10);
		
		
		for (Integer integer : s) {
			System.out.println(integer);	
		}
		
	}

}
