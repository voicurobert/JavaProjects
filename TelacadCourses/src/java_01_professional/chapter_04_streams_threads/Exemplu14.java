package java_01_professional.chapter_04_streams_threads;

public class Exemplu14 {
    public static void main(String[] args) {
        OddNumbersThread t = new OddNumbersThread();
        t.start();
        System.out.println("end");
    }
}
