package server.dao;


import lib.db.Car;
import lib.db.CarRental;
import lib.db.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CarRentalDao extends MainDao {

    public CarRentalDao(EntityManager entityManager) {
        super(entityManager);
    }

    public void rentCarForUser(CarRental carRental) {
        getEntityManager().getTransaction().begin();
        Car car = getEntityManager().merge(carRental.getCar());
        carRental.setCar(car);
        getEntityManager().persist(carRental);
        getEntityManager().getTransaction().commit();
    }

    public List<CarRental> carRentalsForUser(User user) {
        user = getEntityManager().merge(user);
        String sql = "SELECT c FROM CarRental c WHERE c.user = :user";
        TypedQuery<CarRental> query = getEntityManager().createQuery(sql, CarRental.class);
        query.setParameter("user", user);
        return query.getResultList();
    }

}
