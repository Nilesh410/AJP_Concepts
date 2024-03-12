package RMIPackage;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PrintI extends Remote {
	
	public void print() throws RemoteException;

}
