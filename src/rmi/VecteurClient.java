package rmi;
import java.rmi.Naming;
import java.util.Scanner;
public class VecteurClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			VecteurInterface stub = (VecteurInterface) Naming.lookup("rmi://localhost:1099/VecteurInterface");
			Scanner sc = new Scanner(System.in);
			double x;
			double y;	
			double z;
			int i;
			for(i=0;i<10;i++) {
			System.out.print("Please enter value X :");
			x=sc.nextDouble();		
			System.out.print("Please enter value Y :");
			y=sc.nextDouble();
			System.out.print("Please enter value Z :");
			z=sc.nextDouble();
			System.out.print("The vector norme is equal to :"+stub.norme(x, y, z)+"\n");
			System.out.print("Try Again ?\n");}	
		 }
        catch (Exception e) {
        e.printStackTrace();
        }}}

