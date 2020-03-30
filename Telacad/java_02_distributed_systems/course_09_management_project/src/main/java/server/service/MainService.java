package server.service;

import library.db.Clasa;
import library.db.Curs;
import library.rmi.IMainService;
import server.dao.ClasaDao;
import server.dao.CursDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class MainService extends UnicastRemoteObject implements IMainService {
    private EntityManagerFactory emf;

    public MainService() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }


    @Override
    public List<Clasa> getClase() {
        EntityManager em = emf.createEntityManager();
        ClasaDao clasaDao = new ClasaDao(em);
        try {
            return clasaDao.getClase();
        } finally {
            em.close();
        }
    }

    @Override
    public void adaugaCurs(Curs curs) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        CursDao cursDao = new CursDao(em);
        try {
            em.getTransaction().begin();
            cursDao.addCurs(curs);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public List<Curs> getCursuri() throws RemoteException {
        EntityManager em = emf.createEntityManager();
        CursDao cursDao = new CursDao(em);
        try {
            return cursDao.getCursuri();
        } finally {
            em.close();
        }
    }

    @Override
    public void removeClasa(Clasa clasa) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        ClasaDao clasaDao = new ClasaDao(em);
        try {
            em.getTransaction().begin();
            clasaDao.remove(clasa);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
