package lib.main;

import lib.db.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em  = emf.createEntityManager();

        Car car = new Car();
        car.setManufacturer(Manufacturer.Toyota);
        PlateNumber plateNumber = new PlateNumber();
        plateNumber.setCounty("B");
        plateNumber.setNumber(444);
        plateNumber.setCode("ABC");
        car.setPlateNumber(plateNumber);

        User user = new User();
        user.setUsername("robert");
        user.setPassword("robert");

        CarRental carRental = new CarRental();
        carRental.setCar(car);
        carRental.setUser(user);
        carRental.setRentalDate(LocalDateTime.now());

        user.setCarRentals(new ArrayList<>());
        user.getCarRentals().add(carRental);

        car.setCarRentals(new ArrayList<>());
        car.getCarRentals().add(carRental);

        try {
             printRentals(em);
            // printRentalsForCar(em);
            em.getTransaction().begin();
           // em.persist(carRental);
           // em.persist(user);
           // em.persist(car);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printRentals(EntityManager entityManager){
        User user = entityManager.find(User.class, 3);
        System.out.println(user.getCarRentals());
    }

    private static void printRentalsForCar(EntityManager entityManager){
        Car car = entityManager.find(Car.class, 8);
        System.out.println(car.getCarRentals());
    }
}
