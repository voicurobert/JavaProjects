package java_associate.chapter_9_thread;

public class Exemplu1 {

    public static void main(String[] args) {
        OddNumberThread oddNumberThread = new OddNumberThread();
        oddNumberThread
                .start(); // run este metoda principala a firului de executie. start este comportamentul oricarui fir de executie cu care pornim acel fir de executie
        // run nu ruleaza intr-un fir de executie

        EvenNumbersRunnable evenNumbersRunnable = new EvenNumbersRunnable();

        Thread t = new Thread(evenNumbersRunnable);
        t.start();

        System.out.println("The end");
    }

}
