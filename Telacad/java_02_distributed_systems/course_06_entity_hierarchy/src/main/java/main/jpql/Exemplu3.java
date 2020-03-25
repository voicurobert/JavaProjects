package main.jpql;

import db.Factura;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Exemplu3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        //String sql = "select f from Factura f where f.numar = ?1";
        String sql = "select f from Factura f where f.numar = :numar";
        String sql2 = "select f from Factura f left join fetch f.linii where f.numar = :numar";

        TypedQuery<Factura> query = em.createQuery(sql2, Factura.class);
        query.setParameter("numar", 23);

        List<Factura> list = query.getResultList();
        System.out.println(list);

        em.close();
        emf.close();
    }
}
