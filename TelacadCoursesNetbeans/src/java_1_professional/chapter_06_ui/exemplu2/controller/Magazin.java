/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_1_professional.chapter_06_ui.exemplu2.controller;

import java.util.ArrayList;
import java.util.List;
import java_1_professional.chapter_06_ui.exemplu2.model.Produs;

/**
 *
 * @author robert
 */
public class Magazin {

    private static Magazin singleton;
    private List< Produs> produse;

    private Magazin() {
        produse = new ArrayList<>();
    }

    public static Magazin getInstance() {
        if (singleton == null) {
            singleton = new Magazin();
        }
        return singleton;
    }

    public void adaugaProdus(Produs produs) {
        produse.add(produs);
    }

    public void stergeProdus(Produs produs) {
        produse.remove(produs);
    }

    public List<Produs> getProduse() {
        return produse;
    }

}
