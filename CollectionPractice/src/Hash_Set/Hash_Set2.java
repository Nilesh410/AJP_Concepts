package Hash_Set;

import java.util.HashSet;

public class Hash_Set2 {

	public static void main(String[] args) 
	{
		HashSet <Integer> hs2=new HashSet <Integer>();
		hs2.add(2);
		hs2.add(4);
		hs2.add(10);
		hs2.add(6);
        System.out.println("elements="+hs2);
        
        HashSet <Integer>number=new HashSet<Integer>();
        number.addAll(hs2);
        System.out.println("new hashset="+number);
        number.add(12);
        System.out.println("new hashset="+number);
        
        //remove all
        number.removeAll(hs2);
        System.out.println("after removing="+number);
        
        
        
	}
	

}
