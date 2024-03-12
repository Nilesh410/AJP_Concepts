package Hash_Table;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Table1 {

	public static void main(String[] args) {
		//Hashtable t=new Hashtable();//capacity is 11, load factor is 0.75
		//Hashtable t=new Hashtable(Initial capacity,load factor);
		Hashtable <Integer,String> t=new Hashtable<Integer,String>();
		
		t.put(22101, "Kedar");
		t.put(22102, "Sachin");
		t.put(22103, "Vijay");
		t.put(22104, "Nilima");
		t.put(22102, "Rahul");
		//t.put(22102, null);
		System.out.println("hashtable="+t);
		
		System.out.println("******");
		System.out.println(t.get(22102));

		System.out.println("******");
		t.remove(22102);
		System.out.println(t);
		
		System.out.println("******");
		System.out.println(t.containsKey(22102));
		
		System.out.println("******");
		System.out.println(t.containsValue("Ridant"));
		
		System.out.println("******");
		System.out.println(t.isEmpty());
		
		System.out.println("******");
		System.out.println(t.size());
		
		System.out.println("******");
		System.out.println(t.keySet());
		System.out.println("******");
		for(int i:t.keySet())
		{
			System.out.println(t.get(i));
		}
		
		System.out.println("******");
		System.out.println(t.values());
		System.out.println("******");
		for(String v:t.values())
		{
			System.out.println(v);
		}
		
		System.out.println("******");
		System.out.println(t.entrySet());
		
		System.out.println("******");
		//Entry Specific Method
		
		for(Map.Entry entry:t.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("******");
		//using iterator method
		Set s=t.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
