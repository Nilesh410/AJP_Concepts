package Linked_List;

import java.util.LinkedList;

public class Linked_List3 {

	public static void main(String[] args) 
	{
		LinkedList <String>l3=new LinkedList <String>();
		l3.add("dog");
		l3.add("cat");
		l3.add("horse");
		l3.add("cat");
		System.out.println("list element="+l3);
		
		//add element at first and last position
		l3.addFirst("Tiger");
		l3.addLast("elephant");
		l3.addFirst("zebra");
		System.out.println("after add="+l3);
		
		//getting first and last element from linked list
        System.out.println(l3.getFirst());
        System.out.println(l3.getLast());
        
        //remove first and last element from the linked list
        l3.removeFirst();
        l3.removeLast();
        System.out.println("after removing="+l3);
	}

}
