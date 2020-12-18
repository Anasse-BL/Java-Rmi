package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class VecteurImp extends UnicastRemoteObject implements VecteurInterface {

	public VecteurImp() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}


	 public double norme(double a,double b,double c)throws RemoteException {
		// TODO Auto-generated method stub
		double D;
		double N;		
		D=Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c,2);
		N=Math.sqrt(D);	
		return N;
	}


	
	
}
