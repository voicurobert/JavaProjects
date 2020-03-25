package main.jpql;

import db.LinieFactura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Exemplu4 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        String sql = "select * from LinieFactura f where f.pret > ?";
        Query q = em.createNativeQuery(sql, LinieFactura.class);
        q.setParameter(1, 30);

        List<LinieFactura> list = q.getResultList();
        list.forEach(System.out::println);

        em.close();
        emf.close();
    }
}
