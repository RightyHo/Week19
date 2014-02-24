import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalcClient {
	public static void main(String[] args){
		CalcClient cc = new CalcClient();
		cc.launch();
	}
	private void launch(){
		// If there is no security manager, start one
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		try {
			Remote service = Naming.lookup("//127.0.0.1:1099/calc");
			CalcService calcService = (CalcService) service;
			int receivedAdd = calcService.add(5,9);
			int receivedSubtract = calcService.subtract(14344,338);
			int receivedMultiply = calcService.multiply(5,11);
			double receivedDivide = calcService.divide(44,9);
			System.out.println("Result of Add Operation: " + String.valueOf(receivedAdd));
			System.out.println("Result of Subtract Operation: " + String.valueOf(receivedSubtract));
			System.out.println("Result of Multiply Operation: " + String.valueOf(receivedMultiply));
			System.out.println("Result of Divide Operation: " + String.valueOf(receivedDivide));
		} catch(MalformedURLException ex){
			ex.printStackTrace();
		} catch(NotBoundException ex){
			ex.printStackTrace();
		} catch(RemoteException ex){
			ex.printStackTrace();
		}
	}
}