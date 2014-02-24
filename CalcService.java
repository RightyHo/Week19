import java.rmi.Remote;
import java.rmi.RemoteException;

/**
* An implementation of the echo service.
*/
public interface CalcService extends Remote {
	/**
	* Returns the sum of the two integers
	*
	* @para x & y integers to perform operation on
	* @return the sum of the two integers
	*/
	public int add(int x,int y) throws RemoteException;
	/**
	* Returns the difference between the two integers
	*
	* @para x & y integers to perform operation on
	* @return the difference between the two integers
	*/
	public int subtract(int x,int y) throws RemoteException;
	/**
	* Returns the product of the two integers
	*
	* @para x & y integers to perform operation on
	* @return the product of the two integers
	*/
	public int multiply(int x,int y) throws RemoteException;
	/**
	* Returns the result of dividing two integers
	*
	* @para x & y integers to perform operation on
	* @return the  result of dividing two integers
	*/
	public double divide(int x,int y) throws RemoteException;
}