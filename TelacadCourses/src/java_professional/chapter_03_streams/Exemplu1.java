package java_professional.chapter_03_streams;

public class Exemplu1 {

    public static void main(String[] args) {
        Consumator c1 = new MyConsumer();
        c1.consuma(10);

        // tip anonim
        Consumator c2 = new Consumator() {
            @Override public void consuma(int x) {
                System.out.println("X: " + x);
            }
        };
        c2.consuma(100);

        // expresie lambda
        Consumator c3 = x -> System.out.println("X: " + x);
        // method reference
        Consumator c4 = System.out::println;
    }

    private static class MyConsumer implements Consumator {

        @Override public void consuma(int x) {
            System.out.println("X: " + x);
        }
    }

}
