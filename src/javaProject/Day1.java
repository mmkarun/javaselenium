package javaProject;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Day1 {

	 public void add() {

		 int a=100;
		 int b= 150;
		 int c=a+b;
		 
	}
	
	  String jk ="java selnium course";

	public static void main(String[] args) {

      Map<Integer,String> m =new LinkedHashMap<>();
		 
		 m.put(99, "sachin");
		 m.put(100, "ganguly");
		 m.put(143, "gable");
		 
		 System.out.println(m);
		 
		 int size = m.size();
		 
		 System.out.println(size);

		 m.remove(99);
		 System.out.println(m);
		
         Set<Integer> keySet = m.keySet();
         System.out.println(keySet);
	
         Set<Integer> entrySet = m.keySet();

        System.out.println(entrySet); 

      
        Day1 add =new Day1();

        System.out.println(add);





}

}

