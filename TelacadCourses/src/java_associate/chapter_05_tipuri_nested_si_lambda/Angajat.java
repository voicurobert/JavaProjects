package java_associate.chapter_05_tipuri_nested_si_lambda;

public class Angajat {
    double salariu;
    int vechime;

    public Angajat(double salariu, int vechime) {
        this.salariu = salariu;
        this.vechime = vechime;
    }

    public double calculeazaSalariu() {
        if (vechime > 5) {
            return salariu + 500;
        } else {
            return salariu;
        }
    }
}
