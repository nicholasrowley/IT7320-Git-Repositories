package hotelReservation;

import java.rmi.Remote;

import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ReservationInterface {
	public ArrayList<String> makeReservation() throws RemoteException;
}
