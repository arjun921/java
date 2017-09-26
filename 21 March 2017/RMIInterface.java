import java.rmi.Remote;
public interface RMIInterface extends Remote{
	public int add(int x, int y) throws Exception;
}