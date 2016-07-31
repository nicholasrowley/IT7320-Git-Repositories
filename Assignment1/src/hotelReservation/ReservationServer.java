package hotelReservation;

import java.rmi.registry.Registry;

/**
 * Server side program for this project.
 * @author Nick Rowley
 */
public class ReservationServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
            Registry r =  java.rmi.registry.LocateRegistry.createRegistry(1099);
            
            r.rebind("ReservationMethods", new ReservationMethods());
            
            System.out.println("Server is connected and ready for operation");
        }catch(Exception e){
            
            e.printStackTrace();
            
        }

	}

}
