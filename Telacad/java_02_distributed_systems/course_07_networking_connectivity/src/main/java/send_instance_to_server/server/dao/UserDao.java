package send_instance_to_server.server.dao;

import send_instance_to_server.user.model.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDao {
    private EntityManager em;

    public UserDao(EntityManager em){
        this.em = em;
    }

    public User findUserByUsername(String username) {
        String sql = "select u from user u where u.username = :username";
        TypedQuery<User> q = em.createQuery(sql, User.class);
        q.setParameter("username", username);
        List<User> resultList = q.getResultList();
        return resultList.get(0);
    }
}
