import java.util.ArrayList;
import java.util.Collections;

public class Second {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		
		//Add all elements in different arraylist
        ArrayList al_dup=new ArrayList();
        al_dup.addAll(al);
        System.out.println("different arraylist:-"+al_dup);
        
        //remove all elements from second arraylist
        al_dup.removeAll(al);
        System.out.println("after remove all elements arraylist:-"+al_dup);
        
        //sort arraylist element Collections.sort() method
        System.out.println("Elements in the arraylist="+al);
        Collections.sort(al);
        System.out.println("after sorting elements are="+al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("after sorting reverse elements are="+al);
        Collections.shuffle(al);
        System.out.println("after shuffling elements are:="+al);
	}

}
