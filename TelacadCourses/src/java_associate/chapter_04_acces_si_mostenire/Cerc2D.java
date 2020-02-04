package java_associate.chapter_04_acces_si_mostenire;

public class Cerc2D extends Punct2D {
    double raza;

    public Cerc2D() {
        this(2);
        //super( 0, 0 );
    }

    public Cerc2D(double raza) {
        //this();
        super(0, 0);
        this.raza = raza;
    }

    public double getArie() {
        return 3.14 * this.raza * this.raza;
    }
}
