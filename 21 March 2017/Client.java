import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client{
	public static void main(String[] args){
		try {
		RMIInterface interface1 = (RMIInterface) Naming.lookup("ADD");
		System.out.println("addition : "+interface1.add(54,8));
	} catch (MalformedURLException | RemoteException | NotBoundException e){
		e.printStackTrace();
	} catch (Exception e){
		e.printStackTrace();
	}
	}
}