package java_01_associate.chapter_04_acces_si_mostenire;

public class Poligon {
    private Punct[] puncte;

    public Poligon(Punct[] puncte) {
        this.puncte = puncte;
    }

    public Punct[] getPuncte() {
        Punct[] copyPuncte = null;

        // return a copy so that Poligon class can be imutable
        if (this.puncte != null) {
            copyPuncte = new Punct[this.puncte.length];
            for (int i = 0; i < this.puncte.length; i++) {
                copyPuncte[i] = this.puncte[i];
            }
        }
        return copyPuncte;
    }
}
