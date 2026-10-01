package DCLcource;


import java.util.Collections;
import java.util.LinkedList;

class Mobile implements Comparable<Mobile>  {
	String brand;
    int price;
    
    Mobile(String brand, int price){
    	this.brand = brand;
    	this.price = price;
    }
	
	public int compareTo(Mobile mob) {
              return this.brand.compareTo(mob.brand)   ;   
	}

}
public class Test1 {
	
public static void main(String[] args) {
	


		Mobile m1 = new Mobile("Iphone",125000);
		Mobile m2 = new Mobile("vivo",40000);
		Mobile m3 = new Mobile("samsung",85000);
		Mobile m4 = new Mobile("oppo",25000);
        
		
		LinkedList<Mobile> l = new LinkedList();
		Collections.addAll(l, m1,m2,m3,m4);
		Collections.sort(l);
		
		for(Mobile m : l) {
			System.out.println(m.brand+" " +m.price);
		
		
		}
}
		}



