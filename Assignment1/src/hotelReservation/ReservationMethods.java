package hotelReservation;

import java.sql.*;

import java.rmi.RemoteException;

import  java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * method declarations for RMI 
 * @author Nick Rowley
 */
public class ReservationMethods extends UnicastRemoteObject implements ReservationInterface{

	protected ReservationMethods() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
    public void makeReservation(ArrayList<String> reservation) throws RemoteException {
        Connection myConn = null;
        Statement myStmt = null;
        String sql;
        
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment1", "root" , "Nick1");
            
            // 2. Create a statement
            myStmt = myConn.createStatement();
            
            // 3. Execute SQL insert
            sql = "insert into Reservations (RoomType, ArrivalDate, DepartureDate, OccupantName, BookedBy)" +
                                    "values ( '" + reservation.get(0) + "', '" + reservation.get(1) + "', " + reservation.get(2) + ", '" + reservation.get(3) + ", '" + reservation.get(4) + "')";
            myStmt.executeUpdate(sql);
            
            System.out.println("Database insert successful!\n");
        }
        catch (Exception exc) {
            System.out.println("Could not connect to database please try again later.");
        }
        finally {            
            if (myStmt != null) {
                try {
                    myStmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReservationMethods.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if (myConn != null) {
                try {
                    myConn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ReservationMethods.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
