package service;

import dao.UserDao;
import db.UserDB;
import dto.UserDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class RegisterService {

    @EJB
    private UserDao dao;
    
    public void register(UserDTO user) {
        System.out.println("BLA");
        UserDB userDB = dao.findUser(user.getUsername());
        if (userDB == null) {
            userDB = new UserDB();
            userDB.setUsername(user.getUsername());
            userDB.setParola(user.getParola());
            dao.adaugaUser(userDB);
        }
    }
}
