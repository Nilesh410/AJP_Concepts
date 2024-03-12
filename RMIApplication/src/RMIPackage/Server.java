package RMIPackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

	public static void main(String[] args) throws Exception
	{
		Registry registry =LocateRegistry.createRegistry(5000);
		PrintC obj =new PrintC();
		registry.bind("PRINT", obj);
        System.out.println("Server Started");
	}

}
