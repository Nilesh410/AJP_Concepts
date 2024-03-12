package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List1 {

	public static void main(String[] args) 
	{
	     //Declare the linked list
		LinkedList l=new LinkedList();
		//Homogenous Data
		//LinkedList <Integer>l1=new LinkedList<Integer>();
        
		//add elements in the linked list
		l.add(100);
		l.add("Nilesh");
		l.add(23.4);
		l.add(true);
		l.add('A');
		l.add(null);
	    System.out.println(l);
	    
	    System.out.println("size="+l.size());
	    
	    l.remove(2);//pass index
	    //l.remove('A');//not remove by value
	    System.out.println("after removing new list="+l);
	    
	    //Insert at the middle of linked list
	    l.add(2,23.4);
	    System.out.println("after inserting="+l);
	    
	    //Retrieve the data
	    System.out.println(l.get(4));
	    
	    //change the value
	    l.set(0,101);
	    System.out.println(l);
	    
	    //present the object or not
	    System.out.println(l.contains(null));
	    
	    //isEmpty
	    System.out.println(l.isEmpty());
	    
	    //to read the linked list data
	    //1)By using for loop
	    for(int i=0;i<l.size();i++)
	    {
	    	System.out.print(l.get(i)+" ");
	    }
	    
	    //2)By using each for loop
	    for(Object e:l)
	    {
	    	System.out.println(e);
	    }
	    
	    //3)By using Iterator way
	    Iterator it=l.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    
	    
	}
}
