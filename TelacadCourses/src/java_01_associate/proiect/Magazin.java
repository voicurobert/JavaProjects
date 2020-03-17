package java_01_associate.proiect;

import java.util.ArrayList;
import java.util.List;

public class Magazin {

    private List<Produs> produse = new ArrayList<>();

    private static Magazin instance;

    private Magazin() {

    }

    public List<Produs> getProduse() {
        return produse;
    }

    public static Magazin getInstance() {
        if (instance == null) {
            instance = new Magazin();
        }
        return instance;
    }

    public void adaugaProdus(Produs p) {
        if (produse.size() < 100) {
            produse.add(p);
        } else {
            throw new PreaMulteProduseException();
        }
    }

    public void afisareProduse() {
        produse.forEach(System.out::println);
    }
}
