package hotelReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationClient {
	
	public static void main(String[] args) {
		ArrayList<String> reservationInput = new ArrayList<String>(); /* RoomType(VARCHAR max size 25), ArrivalDate(Date), DepartureDate(Date), 
			OccupantName(VARCHAR max size 50), BookedBy(VARCHAR max size 50)*/
			//add variable for viewing here. (after add functionality)
		
		// TODO save reservation input to ArrayList<String> (add error checks later)
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
		

	}

}
