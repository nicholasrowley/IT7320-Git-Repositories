package hotelReservation;

import java.util.ArrayList;
import java.util.Scanner;
import java.rmi.Naming;

/**
 * This class collects information about the Reservation and saves it to the database.
 * @author Nick Rowley
 */
public class ReservationClient {
	
	public static void main(String[] args) {
		ArrayList<String> reservationInput = new ArrayList<String>(); /* RoomType(VARCHAR max size 25), ArrivalDate(Date), DepartureDate(Date), 
			OccupantName(VARCHAR max size 50), BookedBy(VARCHAR max size 50)*/
		
		ReservationInterface connection;
		
			//add variable for viewing here. (after add functionality)
		
		// Enter reservation information
		System.out.println("Enter reservation RoomType(letters max 25): ");
		//save input code here
		Scanner sc1 = new Scanner(System.in);
		reservationInput.add(sc1.next());
		System.out.println("Enter reservation ArrivalDate(yyyy-mm-dd): ");
		//save input code here
		Scanner sc2 = new Scanner(System.in);
		reservationInput.add(sc2.next());
		System.out.println("Enter reservation DepartureDate(yyyy-mm-dd): ");
		//save input code here
		Scanner sc3 = new Scanner(System.in);
		reservationInput.add(sc3.next());
		System.out.println("Enter reservation OccupantName(letters max 50): ");
		//save input code here
		Scanner sc4 = new Scanner(System.in);
		reservationInput.add(sc4.next());
		System.out.println("Enter reservation BookedBy(letters max 50): ");
		//save input code here
		Scanner sc5 = new Scanner(System.in);
		reservationInput.add(sc5.next());
		
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		
		//try and connect to database
		try {
			System.out.println("Adding data into database...");
		
			connection = (ReservationInterface) Naming.lookup("//localhost/ReservationMethods");
			connection.makeReservation(reservationInput);
			
		 } catch (Exception ex) {
             System.out.println("Error: Unable to store results please check "
                     + "database connection and try again.");
             ex.printStackTrace();
         }
	}

}
