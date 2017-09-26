import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server{
	public static void main(String[] args){
		try{
			AddC addC = new AddC();
			Naming.rebind("ADD",addC);
			System.out.println("Server Started");
		} catch(RemoteException|MalformedURLException e){
			e.printStackTrace();
		}
	}
}