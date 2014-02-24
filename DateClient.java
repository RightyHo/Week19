import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

public class DateClient {
	public static void main(String[] args){
		DateClient dc = new DateClient();
		dc.launch();
	}
	private void launch(){
		// If there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/date");
			DateService dateService = (DateService) service;
			Date receivedDate = dateService.getCurrentDate();
			System.out.println(receivedDate.toString());
		} catch(MalformedURLException ex){
			ex.printStackTrace();
		} catch(NotBoundException ex){
			ex.printStackTrace();
		} catch(RemoteException ex){
			ex.printStackTrace();
		}
	}
}