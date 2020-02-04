package java_associate.chapter_02_structuri_de_control_si_orientare_pe_obiect;

public class Cerc {

    final double pi = 3.14;
    double raza;
    Punct centru;

    Cerc(double raza, Punct centru) {
        this.raza = raza;
        this.centru = centru;
    }

    double arie() {
        return pi * raza * raza;
    }

    double getLungime() {
        return 2 * pi * raza;
    }

    boolean isTangent(Cerc cerc) {
        // true tangent intr-un singur punct
        // false, nu sunt tangent, fie tangent in mai multe puncte
        if (this.raza + cerc.raza == this.centru.getDistance(cerc.centru)) {
            return true;
        } else {
            return false;
        }
    }
}
