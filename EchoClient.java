import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class EchoClient {
	public static void main(String[] args){
		String para = args[0];
		EchoClient ec = new EchoClient();
		ec.launch(para);
	}
	private void launch(String str){
		// If there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/echo");
			EchoService echoService = (EchoService) service;
			String receivedEcho = echoService.echo(str);
			System.out.println(receivedEcho);
		} catch(MalformedURLException ex){
			ex.printStackTrace();
		} catch(NotBoundException ex){
			ex.printStackTrace();
		} catch(RemoteException ex){
			ex.printStackTrace();
		}
	}
}