package java_01_associate.chapter_06_exceptii_si_erori;

// singleton thread safe
public class Punct {
    int x;
    int y;

    private Punct() {

    }

    private static final class SingletonHolder {
        private static final Punct SINGLETON = new Punct();
    }

    public static Punct getInstance() {
        return SingletonHolder.SINGLETON;
    }

    @Override public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Punct) {
            Punct punct = (Punct) obj;
            return this.x == punct.x && this.y == punct.y;
        }

        return false;
    }

    @Override public String toString() {
        return "X: " + x + " Y: " + y;
    }
}
