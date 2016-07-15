package hotelReservation;

import java.rmi.Remote;

import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ReservationInterface {
	public void makeReservation(ArrayList<String> reservation) throws RemoteException;
}
