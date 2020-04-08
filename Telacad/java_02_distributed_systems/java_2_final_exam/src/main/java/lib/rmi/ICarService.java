package lib.rmi;

import lib.db.Car;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ICarService extends Remote {

    void addCar(Car car) throws RemoteException;

    List<Car> getCars() throws RemoteException;
}
