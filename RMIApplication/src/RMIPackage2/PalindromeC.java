package RMIPackage2;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class PalindromeC extends UnicastRemoteObject implements PalindromeI {

	public PalindromeC() throws RemoteException 
	{
		super();
	}
	
	public boolean pcheck(String str)
	{   
		boolean b=false;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			b=true;
		}
		
		return b;
	}

}
