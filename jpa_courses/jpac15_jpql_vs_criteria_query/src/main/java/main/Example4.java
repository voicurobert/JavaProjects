package main;

import entities.Product;

import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.List;

public class Example4 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Product> q = builder.createQuery(Product.class);

        Expression parameter = builder.parameter(Double.class, "price");

        Root<Product> product = q.from(Product.class);
        q.select(product).where(
                builder.greaterThan(product.get("price"), parameter)
        );

        TypedQuery<Product> query = em.createQuery(q);
        query.setParameter("price", 10.0);
        List<Product> list = query.getResultList();
        list.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
    }

}
