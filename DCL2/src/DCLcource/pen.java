package DCLcource;

import java.util.*;

class test {

	String Brand;
	String colour;
	test(String Brand , String colour){
		this.Brand = Brand;
		this.colour = colour;
	}
	
}

class penCompare implements Comparator<test>{

	@Override
	public int compare(test e1, test e2) {
		return e1.Brand.compareTo(e2.Brand);
	}
	
	
	
}




 public class pen {
	 public static void main(String[] args) {
		
	
		
        penCompare p = new penCompare();
		TreeSet<test> t = new TreeSet(p);
		test t1 = new test("MEOW","pink");
		test t2 = new test("Flair","red");
		test t3 = new test("Hauser","blue");
		t.add(t1);
		t.add(t2);
		t.add(t3);
		 

		for(test ts:t) {
			System.out.println(ts.Brand+" "+ts.colour);
		} 
	}
 }
 
 
 
 
 
 
