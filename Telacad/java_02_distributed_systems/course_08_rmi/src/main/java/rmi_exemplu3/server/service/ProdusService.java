package rmi_exemplu3.server.service;

import rmi_exemplu3.library.db.Produs;
import rmi_exemplu3.library.rmi.IProdusService;
import rmi_exemplu3.server.dao.ProdusDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ProdusService extends UnicastRemoteObject implements IProdusService {

    private EntityManagerFactory emf;

    public ProdusService() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }


    @Override
    public void adaugaProdus(Produs produs) {
        EntityManager em = emf.createEntityManager();
        ProdusDao produsDao = new ProdusDao(em);
        try {
            em.getTransaction().begin();
            produsDao.adaugaProdus(produs);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Produs> getAllProducts() {
        EntityManager em = emf.createEntityManager();
        try {
            return new ProdusDao(em).getAllProducts();
        } finally {
            em.close();
        }
    }

    @Override
    public void removeProdus(Produs produs) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            new ProdusDao(em).stergeProdus(produs);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
