package RMIPackage2;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException 
	{
		Registry registry=LocateRegistry.createRegistry(7000);
		PalindromeC obj=new PalindromeC();
		registry.bind("PALINDROMECHECK", obj);
		System.out.println("Server Started");  
	}
}
