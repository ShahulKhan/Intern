package Collections;

import java.util.List;
import java.util.LinkedList;

public class List1 {

	public static void main(String[] args) {
	
		List<Integer> l = new LinkedList <> ();
		
		l.add(10);
		l.add(50);
		l.add(20);
		l.add(40);
		l.add(30);
		l.add(10);
		l.add(50);
		
		System.out.println("Length of this List = " + l.size());
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	
}
