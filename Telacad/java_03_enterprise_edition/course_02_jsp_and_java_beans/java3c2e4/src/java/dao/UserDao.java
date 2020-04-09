/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

/**
 *
 * @author robert
 */
public class UserDao {
    
    private Connection connection;
    private PreparedStatement stmtSelectByUsername;
    private PreparedStatement stmtAddUser;
    
    public UserDao(Connection con) {
        this.connection = con;
        try {
            stmtSelectByUsername = con.prepareStatement("select * from users where username = ?");
            stmtAddUser = con.prepareStatement("insert into users values (null, ?, ?)");
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public User findUserByUsername(String username) throws SQLException {
        stmtSelectByUsername.setString(1, username);
        
        try (ResultSet rs = stmtSelectByUsername.executeQuery()) {
            if (rs.next()) {
            return new User(rs.getString("username"), rs.getString("password"));
            }
        }
        
        return null;
    }
    
    public void addUser(User user) throws SQLException {
        stmtAddUser.setString(1, user.getNume());
        stmtAddUser.setString(2, user.getPassword());
        stmtAddUser.executeUpdate();
    }
}
