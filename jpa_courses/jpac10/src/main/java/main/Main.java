package main;

import main.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        /*
        Animal a = new Animal();
        a.setName("Animal");

        Cat c = new Cat();
        c.setName("Cat");
        c.setColor("blue");

        em.persist(a);
        em.persist(c);

        */

        /*
        Product p = new Product();
        p.setName("P");

        Chocolate c = new Chocolate();
        c.setkCal(100);
        c.setName("C");

        em.persist(p);
        em.persist(c);
        */


//        Employee e = new Employee();
//        e.setName("EE");
//        e.setId(1);
//        Manager m = new Manager();
//        m.setName("MMM");
//        m.setResponsability("bla");
//        m.setId(11);
//        em.persist(e);
//        em.persist(m);


        Car c = new Car();
        c.setGas("petrol");
        c.setColor("red");

        Bicycle b = new Bicycle();
        b.setColor("red");
        b.setModel("1234");

        em.persist(c);
        em.persist(b);

        em.getTransaction().commit();
        em.close();
    }
}
