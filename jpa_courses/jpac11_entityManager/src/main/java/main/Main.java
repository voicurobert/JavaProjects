package main;


import main.entities.Product;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

    /*
    persist()   - add instances to the context

    flush() - forces the implementation to make the changes from the entity manager context before the commit

    find()  - retrieve an instance from the database using its id
            - null will be returned if the object does not exits in the database

    getReference()  - does not retrieve all the details of the instances

    contains()  - instance exists in the context

    detach()    - removes instance from context

    clear() - removes all the instances from context

    remove()    -

    merge() -

    refresh()   -

     */

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
//
//        Product p = new Product();
//        p.setId(11);
//        p.setName("P1");
//
//        em.persist(p);
//        em.flush();
//
//        System.out.println(":)");

        Product p = em.find(Product.class, 10);



        em.getTransaction().commit();
        em.close();
    }
}
