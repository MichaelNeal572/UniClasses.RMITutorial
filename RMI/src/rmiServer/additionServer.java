package rmiServer;

import java.rmi.*;
import java.rmi.registry.*;

public class additionServer {
	public static void main(String args[]) throws RemoteException{
		
		try {
			Addition add=new Addition();
			Naming.rebind("Mike", add);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
