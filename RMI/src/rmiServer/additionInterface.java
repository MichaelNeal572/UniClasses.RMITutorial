package rmiServer;
import java.rmi.*;

public interface additionInterface extends Remote{
	public int add(int a, int b) throws RemoteException;
}
