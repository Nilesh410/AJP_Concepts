package RMIPackage2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException 
	{
		
		PalindromeI obj=(PalindromeI)Naming.lookup("rmi://localhost:7000/PALINDROMECHECK");
		System.out.println("-----------------------------------");
		System.out.println("Task:- Check the palindrome or not");
		System.out.println("-----------------------------------");
		int ch;
		do
		{
			int choice=choiceinput();
			String str;
			switch(choice)
			{
			case 1:System.out.println("Enter the string value");
			       str=input.next();
			       boolean result =obj.pcheck(str);
			       if(result)
			    	   System.out.println("String is palindrome");
			       else
			    	   System.out.println("String is not palindrome");
			       break;
			case 2:System.out.println("Enter the number to check");
			       str=input.next();
		           boolean result1=obj.pcheck(str);
		           if(result1)
		        	   System.out.println("Number is palindrome");
		           else
		        	   System.out.println("No is not palindrome");
		            break;
			        
			}
			System.out.println("Continue for further selection press1 otherwise 0");
			ch=input.nextInt();
		}while(ch!=0);
	}
	
	public static int choiceinput()
	{
		try
		{
			System.out.println("Options");
			System.out.println("1.String"+"\n"+"2.Number");
			int number=input.nextInt();
			if(number<1||number>2) throw new Exception();
			return number;
		}
		catch(Exception e)
		{
			System.out.println("Error:Please select the correct option 1 or 2");
			return choiceinput();
		}
	}

}
