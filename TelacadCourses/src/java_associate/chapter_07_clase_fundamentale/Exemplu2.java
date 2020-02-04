package java_associate.chapter_07_clase_fundamentale;

public class Exemplu2 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            m(2);
            System.out.println("B");
        } catch (FooException e) {
            System.out.println("C");
        } catch (BazException e) {
            System.out.println("D");
        } catch (Exception e) {
            System.out.println("E");
        }
    }

    public static void m(int x) throws BazException {
        if (x > 10) {
            throw new FooException();
        }
        if (x < 5) {
            throw new BazException();
        }
    }
}
