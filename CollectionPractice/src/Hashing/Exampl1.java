package Hashing;

import java.util.Hashtable;
import java.util.HashMap;

public class Exampl1 {

	public static void main(String[] args) 
	{
		Hashtable <String,Integer> hs=new Hashtable<String,Integer>();
		hs.put("Nilesh", 100);
		hs.put("Tom", 200);
		hs.put("Lisa", 300);
		hs.put("Peter", 400);
		hs.put("Robert", 600);
		System.out.println("Hashmap="+hs);
		for(Object i:hs.keySet())
		{
			System.out.println("Hashcode of Key "+i+"="+i.hashCode());
//			System.out.println("Index of key "+i+"="+(i.hashCode()%11));
			//(hashCode & 0x7FFFFFFF)
			System.out.println("Index of key "+i+"="+(i.hashCode()&0x7FFFFFFF)%11);
		}
		

	}

}
