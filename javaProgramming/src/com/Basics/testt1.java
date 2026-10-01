package com.Basics;
import java.util.*;
public class testt1 {

	public static void main(String[] args) {
		TreeMap m =new TreeMap();
        m.put(25, "narasimha");
        m.put(21, "basu");
        m.put(10,"krishna");
        m.put(23,"hari");
         System.out.println(m);
         
      System.out.println(m.firstKey());
      System.out.println(m.lastKey());
      System.out.println(m.firstEntry());
      System.out.println(m.lastEntry());
      System.out.println(m.higherEntry(21));
      System.out.println(m.ceilingEntry(21));
      System.out.println(m.lowerEntry(23));
      System.out.println(m.floorEntry(10));
     System.out.println(m.pollFirstEntry());
    
	}
	

	
	

}
