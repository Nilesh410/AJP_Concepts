package Queue_Concept;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue1 {

	public static void main(String[] args) {
		//PriorityQueue q = new PriorityQueue();
		LinkedList q=new LinkedList();

		// adding elements

		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("D");
		q.offer("A");
		q.offer(100);
		System.out.println("queue=" + q);

		// head element
		System.out.println(q.element());
		System.out.println(q.peek());

		// remove element
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q);
		
		Iterator it=q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//earch for loop
		for(Object e:q)
		{
			System.out.println(e);
		}
	}

} 
