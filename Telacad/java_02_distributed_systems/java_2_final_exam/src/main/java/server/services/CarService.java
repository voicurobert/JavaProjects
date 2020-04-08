package server.services;

import lib.db.Car;
import lib.rmi.ICarService;
import lib.rmi.IUserService;
import server.dao.CarDao;
import server.dao.UserDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class CarService extends UnicastRemoteObject implements ICarService {

    private EntityManagerFactory emf;

    public CarService() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    @Override
    public void addCar(Car car) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        CarDao carDao = new CarDao(em);
        try {
            carDao.addCar(car);
        } finally {
            em.close();
        }
    }

    @Override
    public List<Car> getCars() throws RemoteException {
        EntityManager em = emf.createEntityManager();
        CarDao carDao = new CarDao(em);
        try {
            return carDao.getCars();
        } finally {
            em.close();
        }
    }
}
