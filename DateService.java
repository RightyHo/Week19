import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.Date;

/**
* An implementation of the echo service.
*/
public interface DateService extends Remote {
	/**
	* Returns the current date
	*
	* @return the current date
	*/
	public Date getCurrentDate() throws RemoteException;
}