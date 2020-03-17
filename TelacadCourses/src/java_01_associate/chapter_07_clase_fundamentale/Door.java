package java_01_associate.chapter_07_clase_fundamentale;

public class Door implements AutoCloseable {


    public Door() {
        open();
    }

    public void open() {
        System.out.println("OPENED");
    }

    @Override public void close() {
        System.out.println("CLOSED");
        throw new RuntimeException("Closing");
    }
}
