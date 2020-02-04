package java_professional.chapter_01_io_streams;

import java.io.Serializable;

public class Punct implements Serializable {
    private static final long serialVersionUID = 1L;
    int x;
    int y;
    int z;

    public Punct(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
