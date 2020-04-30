package dao;

import db.UserDB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class UserDao {

    @PersistenceContext
    private EntityManager em;
    
    public UserDB findUser(String username) {
        Query query = em.createNamedQuery("UserDB.findByUsername");
        query.setParameter("username", username);
        try {
            return (UserDB) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public void adaugaUser(UserDB user) {
        em.persist(user);
    }
}
