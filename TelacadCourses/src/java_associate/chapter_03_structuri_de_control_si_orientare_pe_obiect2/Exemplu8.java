package java_associate.chapter_03_structuri_de_control_si_orientare_pe_obiect2;

public class Exemplu8 {
    public static void main(String[] args) {
        int[][] m;
        m = new int[4][];
        m[0] = new int[7];
        m[1] = new int[9];
        m[2] = new int[3];
        m[3] = new int[5];


        int c = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = c;
                c++;
            }
        }

        for (int[] a : m) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
