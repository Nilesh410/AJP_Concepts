package RMIPackage;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException 
	{
		PrintI obj=(PrintI) Naming.lookup("rmi://localhost:5000/PRINT");
		obj.print();
	}

}
