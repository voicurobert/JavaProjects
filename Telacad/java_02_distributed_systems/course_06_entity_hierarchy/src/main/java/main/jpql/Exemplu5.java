package main.jpql;

import db.Factura;
import db.LinieFactura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

public class Exemplu5 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        String sql = "select f.serie, COUNT(f) from Factura f";
        Query q = em.createQuery(sql);

        List<Object[]> list = q.getResultList();
        Object[] values = list.get(0);

        Arrays.asList(values).forEach(System.out::println);

        em.close();
        emf.close();
    }
}
