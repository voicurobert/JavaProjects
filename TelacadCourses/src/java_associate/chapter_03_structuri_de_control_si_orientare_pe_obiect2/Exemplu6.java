package java_associate.chapter_03_structuri_de_control_si_orientare_pe_obiect2;

public class Exemplu6 {
    public static void main(String[] args) {
        int[] x = new int[5];

        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }

        for (int a : x) {
            System.out.println(a);
        }
    }
}
