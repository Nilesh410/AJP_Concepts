package Linked_List;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_List2 {

	public static void main(String[] args) 
	{
		LinkedList l2=new LinkedList();
		l2.add("X");
		l2.add("Y");
		l2.add("Z");
		l2.add("A");
		l2.add("B");
		l2.add("C");
        System.out.println("original linkedlist="+l2);
        
        LinkedList l2_copy=new LinkedList();
        l2_copy.addAll(l2);
        System.out.println("copy linked list="+l2_copy);
        
        l2_copy.removeAll(l2);
        System.out.println("copy linked list="+l2_copy);
        
        Collections.sort(l2);
        System.out.println("after sorting="+l2);
        
        Collections.sort(l2,Collections.reverseOrder());
        System.out.println("reverse order="+l2);
        
        Collections.shuffle(l2);
        System.out.println("after shuffle="+l2);
        
        
	}
}
