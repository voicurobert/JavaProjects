/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import db.UserDB;
import dto.UserDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author robert
 */
@Stateless
public class RegisterService {
    
    @EJB
    private UserDao userDao;
    
    public void register(UserDTO user) {
        UserDB userDB = userDao.findUser(user.getUsername());
        if (userDB == null) {
            userDB = new UserDB();
            userDB.setUsername(user.getUsername());
            userDB.setParola(user.getParola());
            userDao.adaugaUser(userDB);
        }
    }
}
