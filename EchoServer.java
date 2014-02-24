import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class EchoServer extends UnicastRemoteObject implements EchoService {
	public EchoServer() throws RemoteException {
		//don't need to initialise anything for this server
	}
	public String echo(String s){
		//this txt isn't necessary just for debugging
		System.out.println("Replied to some client saying '" + s + "'");
		return s;
	}
}

