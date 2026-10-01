package bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		 
		List l = new ArrayList();
        Collections.addAll(l,10,20,30,40,50);
		System.out.println(l);
		
		
		ListIterator lit = l.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
			
			
		ListIterator rit = l.listIterator(l.size());
		while(rit.hasPrevious());
		{
			System.out.println(rit.previous());
		}
		}
		
		
	}

	
}
