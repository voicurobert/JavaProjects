package main.jpql;

import db.Factura;
import db.LinieFactura;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;

public class Exemplu1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        LinieFactura l1 = new LinieFactura();
        l1.setProdus("produs1");
        l1.setPret(33);
        l1.setCantitate(10);

        LinieFactura l2 = new LinieFactura();
        l2.setProdus("produs2");
        l2.setPret(345);
        l2.setCantitate(20);

        LinieFactura l3 = new LinieFactura();
        l3.setProdus("produs3");
        l3.setPret(330);
        l3.setCantitate(40);

        LinieFactura l4 = new LinieFactura();
        l4.setProdus("produs4");
        l4.setPret(1);
        l4.setCantitate(100);

        Factura f1 = new Factura();
        f1.setNumar(23);
        f1.setSerie("factura1");
        Factura f2 = new Factura();
        f2.setNumar(23);
        f2.setSerie("factura2");

        f1.setLinii(Arrays.asList(l1, l2, l3));
        l1.setFactura(f1);
        l2.setFactura(f1);
        l3.setFactura(f1);

        f2.setLinii(Arrays.asList(l4));
        l4.setFactura(f2);

        em.getTransaction().begin();
        em.persist(l1);
        em.persist(l2);
        em.persist(l3);
        em.persist(l4);

        em.persist(f1);
        em.persist(f2);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
