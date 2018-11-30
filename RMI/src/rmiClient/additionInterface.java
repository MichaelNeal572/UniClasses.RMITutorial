package rmiClient;

import java.rmi.RemoteException;

public interface additionInterface {
	public int add(int a,int b) throws RemoteException;
}
