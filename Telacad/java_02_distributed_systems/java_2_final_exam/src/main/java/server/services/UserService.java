package server.services;


import lib.db.User;
import lib.rmi.IUserService;
import server.dao.UserDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserService extends UnicastRemoteObject implements IUserService {

    private EntityManagerFactory emf;

    public UserService() throws RemoteException {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    @Override
    public void addUser(User user) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        UserDao userDao = new UserDao(em);
        try {
            userDao.addUser(user);
        } finally {
            em.close();
        }
    }

    @Override
    public boolean usernameExists(String username) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        UserDao userDao = new UserDao(em);
        try {
            return userDao.usernameExists(username);
        } finally {
            em.close();
        }
    }

    @Override
    public User loginUser(String username, String password) throws RemoteException {
        EntityManager em = emf.createEntityManager();
        UserDao userDao = new UserDao(em);
        try {
            return userDao.loginUser(username, password);
        } finally {
            em.close();
        }
    }

}
