package main.jpql;

import db.Factura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Exemplu6 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Factura> q = em.createNamedQuery("Factura.getById", Factura.class);
        q.setParameter("id", 6);

        List<Factura> facturi = q.getResultList();
        facturi.forEach(System.out::println);

        em.close();
        emf.close();
    }
}
