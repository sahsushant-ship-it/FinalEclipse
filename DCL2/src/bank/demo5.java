package bank;

import java.util.Collections;
import java.util.LinkedList;

public class demo5 {
    public static void main(String[] args) {
		LinkedList l = new LinkedList();
		Collections.addAll(l, 100,200,300,400,500);
		
	    System.out.println(l);
	    l.remove(2);
	    System.out.println(l);
	    l.removeFirst();
	    System.out.println(l);
	    l.removeLast();
	    System.out.println(l);
	System.out.println(l.get(0));
	System.out.println(l.peek());
	System.out.println(l.poll());
	System.out.println(l);
	l.add(1);
	l.add(2);
	l.add(3);
	LinkedList l2 = new LinkedList();
	l2.add(101);
	l2.add(104);
	System.out.println(l2);
	l.addAll(2,l2);
	System.out.println(l);
	l.
	}
}
