import java.util.ArrayList;
import java.util.Iterator;
public class First {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add("Nilesh");
		al.add(true);
		al.add(23.5);
		al.add('A');
		al.add(1);
		al.add("Welcome");
		System.out.println(al);
		
		al.add(2,"Welcome");
		System.out.println(al);
		
		al.remove(1);
		al.remove("Welcome");
		System.out.println(al);
		
		//reterive specific element
	    System.out.println(al.get(2));
	    
	    //change/replace element
	     al.set(3, "Welcome");
	     System.out.println(al);
	     
	     //search a particular element -return true/false
	     al.contains(false);
	     System.out.println(al.contains(false));
	     
	     //array list empty or not
	     System.out.println(al.isEmpty());
	     
	     //1) For Loop
	     System.out.println("1) Read the element using for loop");
	     for(int i=0;i<al.size();i++)
	     {
	    	 System.out.println(al.get(i));
	     }
	     
	     //2) For each loop
	     System.out.println("2) For each loop");
	     for(Object e:al)
	     {
	    	 System.out.println(e);
	     }
	     
	     //3) Iterator way
	     System.out.println("3) Iterator way");
	     Iterator it=al.iterator();
	     while(it.hasNext())
	     {
	    	 System.out.println(it.next());
	     }
		
	}

}
