package main;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        String jpql = "select p from Product p where p.price > 10";
        TypedQuery<Product> query = em.createQuery(jpql, Product.class);
        List<Product> list = query.getResultList();
        list.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
    }
}
