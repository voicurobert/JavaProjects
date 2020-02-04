package java_associate.chapter_07_clase_fundamentale;

public class Exemplu5 {
    public static void main(String[] args) {
        try (Door d1 = new Door(); Door d2 = new Door();) {
            // folosim resursa
            System.out.println("A");
            if (1 == 1)
                throw new RuntimeException("In try");
            System.out.println("B");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println(t);
            }
        } finally {
            System.out.println("C");
            // finally explicit
        }
    }
}
