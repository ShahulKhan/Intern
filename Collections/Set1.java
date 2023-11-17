package Collections;

import java.util.Set;
import java.util.LinkedHashSet;

public class Set1 {

	public static void main(String[] args) {
		
		Set<Integer> s = new LinkedHashSet<> ();
		
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
