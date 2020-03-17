package java_01_associate.chapter_05_tipuri_nested_si_lambda;

public class Exemplu5 {

    public static void main(String[] args) {
        Angajat a1 = new Angajat(1000, 3);
        Angajat a2 = new Angajat(1000, 10);
        Angajat gigel = new Angajat(1000, 1) {
            // clasa anonima
            @Override public double calculeazaSalariu() {
                return 5000;
            }
        };
        System.out.println(a1.calculeazaSalariu());
        System.out.println(a2.calculeazaSalariu());
        System.out.println(gigel.calculeazaSalariu());

        Instrument i = new Instrument() {
            @Override public void play() {

            }
        };


        // interfata functionala = o singura metoda abstracta!!!
        Instrument i2 = () -> {};
    }

}
