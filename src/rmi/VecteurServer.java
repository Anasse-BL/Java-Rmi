package rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class VecteurServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			LocateRegistry.createRegistry(1099);
			VecteurImp obj = new VecteurImp();
			Naming.rebind("rmi://localhost:1099/VecteurInterface", obj);
			 System.out.println 
			  ("Server is connected and ready for operation.");
			  } 
			  catch (Exception e) {
			  System.out.println ("Server not connected: " + e);
			  }
			  }
			}