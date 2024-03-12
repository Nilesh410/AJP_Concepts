package RMIPackage;

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

public class PrintC extends UnicastRemoteObject implements PrintI {

	public PrintC() throws RemoteException {
		super();
	}

	public void print()
	{
		System.out.println("Hello Message");
	}

}
