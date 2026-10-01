package bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
	public static void main(String[] args) {
		 List l = new ArrayList();
		 List l1 = new ArrayList();
		 l.add(10);
		 l.add(20);
		 l.add(30);
		 l.add(40);
		 l.add(50);
		 Collections.addAll(l,60,70,80,90);
		 System.out.println(l);
		 Collections.addAll(l1,2,100,200);
		 System.out.println(l1);
		 
		 
	}

}
