package send_instance_to_server.server.service;

import send_instance_to_server.server.dao.UserDao;
import send_instance_to_server.user.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

public class RegisterService {
    private EntityManagerFactory emf;

    private RegisterService() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    private static final class SingletonHolder {
        private static final RegisterService SINGLETON = new RegisterService();
    }

    public static RegisterService getInstance(){
        return SingletonHolder.SINGLETON;
    }

    public boolean register(User user) {
        EntityManager em = emf.createEntityManager();
        UserDao dao = new UserDao(em);
        try {
            em.getTransaction().begin();
            Optional<User> existentUser = dao.findUserByUsername(user.getUsername());
            if (existentUser.isPresent()) {
                return false;
            } else {
                dao.addUser(user);
                em.getTransaction().commit();
                return true;
            }
        } finally {
            em.close();
        }
    }
}
