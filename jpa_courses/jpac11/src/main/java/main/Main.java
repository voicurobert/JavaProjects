package main;


import main.entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    /*
    persist() - add instances to the context

    flush()

    find() - retrieve an instance from the database using its id

    getReference() - does not retrieve all the details of the instances

    contains() - instance exists in the context

    detach() - removes instance from context

    clear() - removes all the instances from context

    remove()

    merge()

    refresh()

     */

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p = new Product();
        p.setId(10);
        p.setName("P1");
        em.persist(p);

        System.out.println(":)");

        em.getTransaction().commit();
        em.close();
    }
}
