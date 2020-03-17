package java_01_associate.chapter_02_structuri_de_control_si_orientare_pe_obiect;

public class Punct {
    int x, y;

    Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(Punct p) {
        double rez = Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
        return rez;
    }
}
