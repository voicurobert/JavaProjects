/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_08_jdbc.exemplu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_1_professional.chapter_08_jdbc.exemplu.model.Departament;

/**
 *
 * @author Robert
 */
public class DepartamentDAO {

    private Connection connection;
    private PreparedStatement stmtInsert;
    private PreparedStatement stmtGet;

    public DepartamentDAO(Connection connection) {
        this.connection = connection;
        try {
            stmtInsert = this.connection.prepareStatement("INSERT INTO departamente VALUES (null, ?)");
            stmtGet = this.connection.prepareStatement("SELECT * FROM departamente");
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean create(Departament departament) {
        try {
            stmtInsert.setString(1, departament.getNume());
            return stmtInsert.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List< Departament> findAll() {
        try (ResultSet rs = stmtGet.executeQuery()) {
            List< Departament> list = new ArrayList<>();
            while (rs.next()) {
                Departament d = new Departament(rs.getInt("id"), rs.getString("nume"));
                list.add(d);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }
}
