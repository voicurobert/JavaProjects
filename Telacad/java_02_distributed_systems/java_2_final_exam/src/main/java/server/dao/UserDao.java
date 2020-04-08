package server.dao;


import lib.db.User;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import java.util.Optional;

public class UserDao extends MainDao{

    public UserDao(EntityManager entityManager) {
        super(entityManager);
    }

    public void addUser(User user) {
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(user);
        getEntityManager().getTransaction().commit();
    }

    public boolean usernameExists(String username) {
        TypedQuery<User> query = getEntityManager().createNamedQuery("usernameExists", User.class);
        query.setParameter("username", username);
        try {
            Optional<User> user = Optional.of(query.getSingleResult());
            return true;
        } catch (NoResultException e) {
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public User loginUser(String username, String password) {
        TypedQuery<User> query = getEntityManager().createNamedQuery("usernameAndPasswordExists", User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }


}
