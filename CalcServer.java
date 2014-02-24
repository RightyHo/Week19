import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcServer extends UnicastRemoteObject implements CalcService {
	public CalcServer() throws RemoteException {
		//no need to do anything
	}
	/**
	* Returns the sum of the two integers
	*
	* @para x & y integers to perform operation on
	* @return the sum of the two integers
	*/
	public int add(int x,int y) throws RemoteException{
		return x+y;
	}
	/**
	* Returns the difference between the two integers
	*
	* @para x & y integers to perform operation on
	* @return the difference between the two integers
	*/
	public int subtract(int x,int y) throws RemoteException{
		return x-y;
	}
	/**
	* Returns the product of the two integers
	*
	* @para x & y integers to perform operation on
	* @return the product of the two integers
	*/
	public int multiply(int x,int y) throws RemoteException{
		return x*y;
	}
	/**
	* Returns the result of dividing two integers
	*
	* @para x & y integers to perform operation on
	* @return the  result of dividing two integers
	*/
	public double divide(int x,int y) throws RemoteException{
		return x/y;
	}
}

