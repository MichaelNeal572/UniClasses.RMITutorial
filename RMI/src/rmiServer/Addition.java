package rmiServer;

import java.rmi.*;
import java.rmi.server.*;

public class Addition extends UnicastRemoteObject implements additionInterface{
	public Addition() throws RemoteException{
		super();
	}
	public int add(int x, int y) {
		return (x+y);
	}
}

