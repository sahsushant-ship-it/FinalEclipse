package DCLcource;

import java.util.TreeSet;

class Emp {
	String name;
	int sal;

	Emp(String name, int sal) {
		this.name = name;
		this.sal = sal;

	}
}

class test001 {
	public static void main(String[] args) {
		TreeSet<Emp> a1 = new TreeSet();
		Emp e1 = new Emp("hari", 25000);
		Emp e2 = new Emp("krishna", 125000);
		Emp e3 = new Emp("basu", 85000);

		a1.add(e1);
		a1.add(e2);
		a1.add(e3);

		System.out.println(a1);

	}
}
