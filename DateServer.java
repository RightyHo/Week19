import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

public class DateServer extends UnicastRemoteObject implements DateService {
	Calendar dateToday;
	public DateServer() throws RemoteException {
		//create a calendar instance
		dateToday = new GregorianCalendar();
	}
	/**
	* Returns the current date
	*
	* @return the current date
	*/
	public Date getCurrentDate() throws RemoteException{
		return dateToday.getTime();
	}
}

