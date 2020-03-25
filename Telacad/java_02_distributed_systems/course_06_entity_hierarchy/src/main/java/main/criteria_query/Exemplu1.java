package main.criteria_query;

import db.Factura;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Exemplu1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Factura> criteriaQuery = criteriaBuilder.createQuery(Factura.class);
        Root<Factura> f = criteriaQuery.from(Factura.class);
        criteriaQuery.select(f);
        criteriaQuery.where(criteriaBuilder.equal(f.get("id"), 6));

        TypedQuery<Factura> facturi = em.createQuery(criteriaQuery);
        List<Factura> list = facturi.getResultList();
        System.out.println(list);


        em.close();
        emf.close();
    }
}
