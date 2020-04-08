package server.services;

import lib.db.Car;
import lib.db.CarRental;
import lib.db.User;
import lib.rmi.ICarRentalService;
import server.dao.CarRentalDao;
import server.dao.UserDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CarRentalService extends UnicastRemoteObject implements ICarRentalService {

    private EntityManagerFactory emf;

    public CarRentalService() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    @Override
    public void rentCarForUser(CarRental carRental) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        CarRentalDao carRentalDao = new CarRentalDao(em);
        try {
            carRentalDao.rentCarForUser(carRental);
        } finally {
            em.close();
        }
    }

    @Override
    public List<CarRental> carRentalsForUser(User user) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        CarRentalDao carRentalDao = new CarRentalDao(em);
        try {
            return carRentalDao.carRentalsForUser(user);
        } finally {
            em.close();
        }
    }
}
