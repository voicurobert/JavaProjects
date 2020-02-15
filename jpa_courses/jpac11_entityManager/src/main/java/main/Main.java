package main;


import main.entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    /*
    persist()               - add instances to the context

    flush()                 - forces the implementation to make the changes from the entity manager context before the commit

    find()                  - retrieve an instance from the database using its id
                            - null will be returned if the object does not exits in the database

    getReference()          - does not retrieve all the details of the instances
                            - is lazy. Only gives a proxy it won t trigger the select in the database until the instance is used!!!

    contains()              - instance exists in the context

    detach()                - removes instance from context

    clear()                 - removes all the instances from context

    remove()                - marks the instance to be deleted, removes it from context and from the database
                            - works only on managed instances, it has to be in a context

    merge()                 - add an instance in the context, it must exists at database level

    refresh()               - will undo all the changes for a specific instance
                            - updates the instance with what we have in the database

     */

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        Product p = new Product();
//        p.setId(11);
//        p.setName("P1");
//
//        em.persist(p);
//        em.flush();
//
//        System.out.println(":)");
//         Product p = em.find(Product.class, 10);
//         System.out.println(em.contains(p));


//        Product p = em.find(Product.class, 11);
//        em.remove(p);

//        Product p = new Product();
//        p.setId(11);
//        em.merge(p);
//        System.out.println(em.contains(p));
//        em.remove(p);

//        Product p = em.find(Product.class, 11);
//        p.setName("A");
//        em.refresh(p);

        Product p = new Product();
        p.setName("BLA");
        p.setId(20);
        em.persist(p);
        em.detach(p); // takes p out from the context
        em.clear();   // takes all instances out of the context


        em.getTransaction().commit();
        em.close();
    }
}
