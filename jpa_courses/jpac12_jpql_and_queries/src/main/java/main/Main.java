package main;


import main.entities.Employee;
import main.entities.Product;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Stream;


public class Main {

    /*
    SQL92


    JPQL is platform independent
    JPQL    - sql select like
            - SELECT p FROM Product p                   Product is the table class in jpa
     */

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        String jpql = "SELECT p FROM Product p";
//        TypedQuery<Product> q = em.createQuery(jpql, Product.class);
//        String jpql = "SELECT p FROM Product p WHERE p.price > :price"; // :price is a jpql parameter
//        TypedQuery<Product> q = em.createQuery(jpql, Product.class);
//        q.setParameter("price", 10.0);

//        String jpql = "SELECT SUM(p.price) FROM Product p WHERE p.price > :price";
//        TypedQuery<Double> q = em.createQuery(jpql, Double.class);
//        q.setParameter("price", 10.0);
//        double d = q.getSingleResult();
//        System.out.println(d);

        // named query, are validated on application startup

//        TypedQuery<Product> q = em.createNamedQuery("Product.all", Product.class);
//        q.getResultStream().forEach(System.out::println);
//
//        String jpql = "SELECT SUM(p.price) FROM Product p WHERE p.price > ?1";
//        TypedQuery<Double> q2 = em.createQuery(jpql, Double.class);
//        q2.setParameter(1, 10.0);
//
//        // native queries
//        String sql = "SELECT * FROM product p";
//        Query query = em.createNativeQuery(sql);
//        query.getResultList().forEach(System.out::println);


        String jpql = "SELECT e FROM Employee e, Department d WHERE e.department = d AND d.id = :id";
        TypedQuery<Employee> query = em.createQuery(jpql, Employee.class);
        query.setParameter("id", 1);
        List<Employee> list = query.getResultList();
        list.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
    }
}
