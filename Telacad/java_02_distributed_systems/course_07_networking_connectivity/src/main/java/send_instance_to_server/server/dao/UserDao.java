package send_instance_to_server.server.dao;

import send_instance_to_server.user.model.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

public class UserDao {
    private EntityManager em;

    public UserDao(EntityManager em){
        this.em = em;
    }

    public Optional<User> findUserByUsername(String username) {
        String sql = "select u from User u where u.username = :username";
        TypedQuery<User> q = em.createQuery(sql, User.class);
        q.setParameter("username", username);
        try {
            return Optional.of(q.getSingleResult());
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public void addUser(User user) {
        em.persist(user);
    }
}
