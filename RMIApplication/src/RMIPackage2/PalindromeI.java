package RMIPackage2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PalindromeI extends Remote
{
     public boolean pcheck(String str)throws RemoteException;
}
