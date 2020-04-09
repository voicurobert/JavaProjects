/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author robert
 */
public class RegisterService {

    private RegisterService() {

    }

    private static final class SingletonHolder {

        private static RegisterService SINGETON = new RegisterService();
    }

    public static RegisterService getInstance() {
        return SingletonHolder.SINGETON;
    }

    public boolean regiserUser(String username, String password) {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/java_3?useSSL=false", "root", "robert406661");
            UserDao dao = new UserDao(con);
            User user = dao.findUserByUsername(username);
            if (user == null) {
                user = new User(username, password);
                dao.addUser(user);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {

                }

            }
        }
        return true;
    }
}
