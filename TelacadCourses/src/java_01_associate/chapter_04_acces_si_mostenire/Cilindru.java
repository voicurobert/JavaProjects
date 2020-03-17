package java_01_associate.chapter_04_acces_si_mostenire;

public class Cilindru extends Cerc2D {
    double h;

    @Override public double getArie() {
        return 2 * super.getArie() + 2 * 3.14 * this.raza * this.h;
    }
}
