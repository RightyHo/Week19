import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class CalcServerLauncher {
	public static void main(String[] args){
		CalcServerLauncher csl = new CalcServerLauncher();
		csl.launch();
	}
	private void launch() {
		// 1. If there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			// 2. Create the registry if there is not one
			LocateRegistry.createRegistry(1099);
			// 3. Create the server object
			CalcServer server = new CalcServer();
			// 4. Register (bind) the server object on the registy.
			// The registry may be on a different machine
			String registryHost = "//localhost/";
			String serviceName = "calc";
			Naming.rebind(registryHost + serviceName, server);
		} catch (MalformedURLException ex) {
			ex.printStackTrace();
		} catch (RemoteException ex) {
			ex.printStackTrace();
		}
	}
}