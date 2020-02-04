package java_associate.chapter_07_clase_fundamentale;

public class Exemplu4 {

    public static void main(String[] args) {
        Door d1 = null;
        Door d2 = null;
        try {
            d1 = new Door();
            d1 = new Door();
        } catch (Exception e) {

        } finally {
            if (d1 != null) {
                d1.close();
            }
            if (d2 != null) {
                d2.close();
            }
        }
    }

}
