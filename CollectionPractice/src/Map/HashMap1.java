package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) 
	{
		//HashMap m=new HashMap();
		HashMap <Integer,String> m=new HashMap<Integer,String>();
		
		//add key value pair
		m.put(22101, "Kedar");
		m.put(22102, "Sachin");
		m.put(22103, "Vijay");
		m.put(22104, "Nilima");
		m.put(22102, "Rahul");
		m.put(null,"ABC");
		m.put(null, null);
		System.out.println("Map="+m);
		
		//reterive the value for perticular key
		System.out.println(m.get(22102));
		
		//remove on the basis of key
		m.remove(22102);
		System.out.println("map="+m);
		
		//value present or not 
	    System.out.println(m.containsKey(22102));
	    System.out.println(m.containsValue("Radhika"));
        
	    //isempty
	    System.out.println(m.isEmpty());
	    
	    //size
	    System.out.println(m.size());
	    
	    
	    //only key set
	    System.out.println(m.keySet());
//	    //invidual enteries
	    for(Object i:m.keySet())
	    {
	    	System.out.print(i+" ");
	    }
	    System.out.println("");
	    
	    
	    //only values from HashMap return collection object
	    System.out.println(m.values());
	    
	    for(Object i:m.values())
	    {
	    	System.out.print(i+ " ");
	    }
	    System.out.println("");
	    
	    
	    //entry set
	    System.out.println(m.entrySet());
	    
	    
	    //by using each for method
	    for(Object i:m.keySet())
	    {
	    	System.out.println(i+" "+m.get(i));
	    }
	    System.out.println("**********");
	    
	    
	    //Entry Interface Method
	    System.out.println("Entry Interface");
	    for(Map.Entry entry:m.entrySet())
	    {
	    	System.out.println(entry.getKey()+"   "+entry.getValue());
	    }
	    
	    //iterator method
	    System.out.println("Entry Interface by Iterator");
	    Set s=m.entrySet();
	    Iterator it=s.iterator();
	    while(it.hasNext())
	    {
//	    	System.out.println(it.next());
	    	Map.Entry entry =(Entry) it.next();
	    	System.out.println(entry.getKey()+"    "+entry.getValue());
	    }
	    
	}

}
