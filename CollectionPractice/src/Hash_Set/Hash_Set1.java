package Hash_Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set1 {

	public static void main(String[] args) 
	{
        //HashSet hs=new HashSet();
        //HashSet hs=new HashSet(100);
		//HashSet hs=new HashSet(100,(float)0.90);
		
		HashSet hs=new HashSet();
		//add element into hashset
		hs.add("JAVA");
		hs.add(100);
		hs.add('A');
		hs.add(12.3);
		hs.add(true);
		hs.add(null);
        System.out.println("hashset element="+hs);
        
        //remove element
        hs.remove(12.3);
        System.out.println("after remove="+hs);
        
        //not get and set method
        
        //element present or not
        System.out.println(hs.contains(true));
        //case sensitive
        
        //isEmpty
        System.out.println(hs.isEmpty());
        
        //read the data
        //1)each for loop
        for(Object e:hs)
        {
        	System.out.print(e+" ");
        }
        
        //2)Iteration way
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next());
        }
        
        

        
	}

}
