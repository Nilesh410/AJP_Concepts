package Hash_Set;

import java.util.HashSet;

public class Hash_Set3 {

	public static void main(String[] args) 
	{
		//Union, Intersection and Difference of sets
		
		HashSet <Integer> set1=new HashSet <Integer>();
	    set1.add(1);
	    set1.add(2);
	    set1.add(6);
	    set1.add(5);
	    System.out.println("set1="+set1);
	    
	    HashSet <Integer> set2=new HashSet <Integer>();
	    set2.add(3);
	    set2.add(6);
	    set2.add(2);
	    set2.add(5);
	    System.out.println("set2="+set2);
	    
	    //union
//	    set1.addAll(set2);
//	    
//	    System.out.println("union="+set1);
		
	    //intersection
//	    set1.retainAll(set2);
//	    System.out.println("intersection="+set1);
	    
	    //difference
//	   set1.removeAll(set2);
//	   System.out.println("diff="+set1);

	   // subset
	    
	  //System.out.println(set1.containsAll(set2));
	}

}
