package DCLcource;

import java.util.*;

class emp {
	String name;
	int sal;

	emp(String name, int sal) {
		this.name = name;
		this.sal = sal;

	}
}
Class empSalCompare implements Comparator<emp>{
	public int Compare(emp e1,emp e2) {
		return e1.sal - e2.sal;
	}
}

class Emp {
	public static void main(String[] args) {
		empSalCompare e10 = new empSalCompare();
		
		TreeSet<Emp> a1 = new TreeSet(e10);
		emp e1 = new emp("hari", 25000);
		emp e2 = new emp("krishna", 125000);
		emp e3 = new emp("basu", 85000);

		a1.add(e1);
		a1.add(e2);
		a1.add(e3);

		
		for (emp ee:a1) {
			
			
			
		
		System.out.println(ee.name+" "+ee.sal+"");

	}
}
}