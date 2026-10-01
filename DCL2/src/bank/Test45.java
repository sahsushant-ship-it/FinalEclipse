package bank;

import java.util.ArrayList;
import java.util.Iterator;

class Employee implements Comparable <Employee>{
	String name;
	int id;
	int age;
	
	Employee(String name, int id, int age){
		this.name = name;
		this.id = id;
		this.age = age;
		
	}
	public int compareTo(Employee e) {
		if(this.id > e.id) {
			return 1;
		}
		else if (this.id < e.id) {
			return -1;
			
		}
		else {
			return 0;
		}
	}
	public String toString() {
		return name +" "+age+" "+id;
		
	}

}
public class Test45 {
	public static void main(String[] args) {
		Employee e1 = new Employee("madhu",101,22);
		Employee e2 = new Employee("krishna",102,24);
		Employee e3 = new Employee("sagar",103,26);
		Employee e4 = new Employee("hari",104,28);
		
		ArrayList<Employee> a1 = new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		a1.add(e4);
		
		Iterator itr = a1.iterator();
		while (itr.hasnext());
		
	}
}
