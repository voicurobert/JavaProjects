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
import java_1_professional.chapter_08_jdbc.exemplu.model.Angajat;

/**
 *
 * @author Robert
 */
public class AngajatDAO {

    private Connection connection;
    private PreparedStatement insertStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement getStatement;

    public AngajatDAO(Connection con) {
        this.connection = con;

        try {
            insertStatement = connection.prepareStatement("INSERT INTO angajati VALUES (null, ?, ?, ?)");
            getStatement = connection.prepareStatement("SELECT * FROM angajati WHERE departament_id = ?");
            deleteStatement = connection.prepareStatement("DELETE FROM angajati WHERE id = ?");
        } catch (SQLException ex) {
            Logger.getLogger(AngajatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean create(Angajat angajat) {
        try {
            insertStatement.setString(1, angajat.getNume());
            insertStatement.setInt(2, angajat.getVarsta());
            insertStatement.setInt(3, angajat.getDepartamentId());
            return insertStatement.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(AngajatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List< Angajat> findByDepartamentId(int departamentId) {
        try {
            getStatement.setInt(1, departamentId);
            List< Angajat> list = new ArrayList<>();
            ResultSet rs = getStatement.executeQuery();

            while (rs.next()) {
                Angajat a = new Angajat(
                        rs.getInt("id"),
                        rs.getString("nume"),
                        rs.getInt("varsta"),
                        rs.getInt("departament_id"));
                list.add(a);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(AngajatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Collections.emptyList();
    }

    public boolean remove(int id) {
        try {
            deleteStatement.setInt(1, id);
            return deleteStatement.executeUpdate() != 0;
        } catch (SQLException ex) {
            Logger.getLogger(AngajatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
