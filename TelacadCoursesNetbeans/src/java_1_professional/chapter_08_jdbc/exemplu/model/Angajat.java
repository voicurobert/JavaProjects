/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_08_jdbc.exemplu.model;

/**
 *
 * @author Robert
 */
public class Angajat {

    private int id;
    private String nume;
    private int varsta;
    private int departamentId;

    public Angajat(int id, String nume, int varsta, int departamentId) {
        this.id = id;
        this.nume = nume;
        this.varsta = varsta;
        this.departamentId = departamentId;
    }

    public int getDepartamentId() {
        return departamentId;
    }

    public void setDepartamentId(int departamentId) {
        this.departamentId = departamentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Angajat{" + "id=" + id + ", nume=" + nume + ", varsta=" + varsta + '}';
    }

}
