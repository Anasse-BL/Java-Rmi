package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VecteurInterface extends Remote {
	  
	double norme(double a, double b, double c) throws RemoteException;
	}
