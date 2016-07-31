package hotelReservation;

import java.rmi.Remote;

import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * The Interface for RMI methods.
 * @author Nick Rowley
 */
public interface ReservationInterface {
	public void makeReservation(ArrayList<String> reservation) throws RemoteException;
}
