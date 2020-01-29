/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_08_jdbc.exemplu.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_1_professional.chapter_08_jdbc.exemplu.dao.AngajatDAO;
import java_1_professional.chapter_08_jdbc.exemplu.dao.DepartamentDAO;
import java_1_professional.chapter_08_jdbc.exemplu.model.Angajat;
import java_1_professional.chapter_08_jdbc.exemplu.model.Departament;

/**
 *
 * @author Robert
 */
public class MainController {

    private DepartamentDAO departamentDAO;
    private AngajatDAO angajatDAO;

    private MainController() {
        String url = "jdbc:mysql://localhost/java1pc8";
        try {
            Connection connection = DriverManager.getConnection(url, "root", "");
            departamentDAO = new DepartamentDAO(connection);
            angajatDAO = new AngajatDAO(connection);
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static MainController getInstance() {
        return MainControllerHolder.INSTANCE;
    }

    private static class MainControllerHolder {

        private static final MainController INSTANCE = new MainController();
    }

    public boolean adaugaDepartament(Departament departament) {
        return departamentDAO.create(departament);
    }

    public List< Departament> getDepartamente() {
        return departamentDAO.findAll();
    }

    public boolean adaugaAngajat(Angajat a) {
        return angajatDAO.create(a);
    }

    public List< Angajat> getAngajatiByDepartamanetId(int depId) {
        return angajatDAO.findByDepartamentId(depId);
    }

    public boolean removeAngajat(Angajat a) {
        return angajatDAO.remove(a.getId());
    }
}
