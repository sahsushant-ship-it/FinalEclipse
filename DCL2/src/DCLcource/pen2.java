package DCLcource;

import java.util.*;

class text {

	String Brand;
	String colour;
	text(String Brand , String colour){
		this.Brand = Brand;
		this.colour = colour;
	}
	
}

class pennCompare implements Comparator<text>{

	@Override
	public int compare(text e1, text e2) {
		return e1.Brand.compareTo(e2.Brand);
	}
	
	
	
}




 public class pen2 {
	 public static void main(String[] args) {
		
		 text t1 = new text("MEOW","pink");
			text t2 = new text("Flair","red");
			text t3 = new text("Hauser","blue");
		
        pennCompare p = new pennCompare();
		TreeSet<text> t = new TreeSet(p);
		
		t.add(t1);
		t.add(t2);
		t.add(t3);
		 

		for(text ts:t) {
			System.out.println(ts.Brand+" "+ts.colour);
		} 
	}
 }
 
    
 
 
 
 

