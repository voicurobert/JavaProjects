package lib.rmi;

import lib.db.CarRental;
import lib.db.User;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ICarRentalService extends Remote {

    void rentCarForUser(CarRental carRental) throws RemoteException;

    List<CarRental> carRentalsForUser(User user) throws RemoteException;
}
