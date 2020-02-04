package java_professional.chapter_01_io_streams;

import java.io.*;

public class Exemplu5 {

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String cmd;
            while (true) {
                System.out.println("Comanda:");
                cmd = bufferedReader.readLine();
                String[] v = cmd.split("\\s+");
                switch (v[0]) {
                    case "exit":
                        return;
                    case "copy":
                        copy(v[1], v[2]);
                        System.out.println("Fisierul a fost copiat!");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(":)");
        }
    }

    private static void copy(String path1, String path2) throws IOException {
        FileInputStream inputStream = new FileInputStream(path1);
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
        PrintStream printStream = new PrintStream(path2);
        String line;
        while ((line = in.readLine()) != null) {
            printStream.println(line);
        }
    }

}
