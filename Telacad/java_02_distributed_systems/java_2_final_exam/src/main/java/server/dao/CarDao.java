package server.dao;

import lib.db.Car;

import javax.persistence.EntityManager;
import java.rmi.RemoteException;
import java.util.List;

public class CarDao extends MainDao {
    public CarDao(EntityManager entityManager) {
        super(entityManager);
    }

    public void addCar(Car car) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(car);
        getEntityManager().getTransaction().commit();
    }

    public List<Car> getCars() {
        return getEntityManager().createNamedQuery("getCars", Car.class).getResultList();
    }
}
