package java_01_associate.chapter_05_tipuri_nested_si_lambda;

@FunctionalInterface public interface Instrument {
    public static final int x = 10;


    void play();

    // java 1.8
    default void m1() {

    }

    static void m2() {

    }
}
