package Collections;

import java.util.Set;
import java.util.TreeSet;

public class Set2 {

	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<> ();
		
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
