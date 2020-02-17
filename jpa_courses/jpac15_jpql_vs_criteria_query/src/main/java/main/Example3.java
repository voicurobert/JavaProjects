package main;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Product> q = builder.createQuery(Product.class);

        Root<Product> product = q.from(Product.class);
        q.select(q.from(Product.class)); // WRONG

        TypedQuery<Product> query = em.createQuery(q);
        List<Product> list = query.getResultList();
        list.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
    }

}
