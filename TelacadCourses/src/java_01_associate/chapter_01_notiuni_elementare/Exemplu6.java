package java_01_associate.chapter_01_notiuni_elementare;

public class Exemplu6 {
    // psti
    // daca este p sau t => ploua
    // pentru v => este cald
    // pentru iarna => este frig
    public static void main(String[] args) {
        char a = 'v';
        switch (a) {
            case 'p':
            case 't':
                System.out.print("Ploua");
                break;
            case 'v':
                System.out.print("Este cald");
                break;
            case 'i':
                System.out.print("Este frig");
                break;
        }
    }
}
