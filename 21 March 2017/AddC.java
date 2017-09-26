import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AddC extends UnicastRemoteObject implements RMIInterface{
	protected AddC() throws RemoteException{
		super();
	}

	public int add(int x, int y) throws Exception{
		return x+y;
	}
}