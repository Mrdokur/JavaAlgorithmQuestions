package JavaAlgorithm;

import java.util.ArrayList;

public class twoRepeatedNumbersInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> la = new ArrayList<>();
		la.add(1);
		la.add(1);
		la.add(2);
		la.add(2);
		la.add(3);
		la.add(3);
		
		
		System.out.println(twoTimes(la));
		
		

	}

	public static ArrayList<Integer> twoTimes(ArrayList<Integer> list){
		  ArrayList<Integer> l1 = new ArrayList<>();
		  
		 for (int i = 0; i < list.size(); i++) {
		   int c = 0;
		   for (int j = 0; j < list.size(); j++) {
		      if(list.get(i) == list.get(j)){
		        c++;
		      }
		
		   }
		   
		   if(c == 2){
	      
		    if( !(l1.contains(list.get(i)))){
		      l1.add(list.get(i)); 
		    }
		   }
		   
		 }
		 
		 
		
		return l1;
		
		
		
	}
	
		
	
}
