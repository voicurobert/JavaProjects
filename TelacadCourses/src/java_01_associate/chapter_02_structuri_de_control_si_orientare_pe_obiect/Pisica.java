package java_01_associate.chapter_02_structuri_de_control_si_orientare_pe_obiect;

public class Pisica {

    String nume;
    int varsta;
    String culoare;

    Pisica(String nume, int varsta, String culoare) {
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
    }

    void spuneMiau() {
        System.out.println("Miau! Numele meu este " + nume);
    }
}
