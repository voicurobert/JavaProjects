package java_01_professional.chapter_01_io_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exemplu16 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
            String cmd;
            while (true) {
                System.out.println("Comanda:");
                cmd = bufferedReader.readLine();
                String[] vec = cmd.split("\\s+");
                switch (vec[0]) {
                    case "exist":
                        return;
                    case "mkdir":
                        new File(vec[1]).mkdir();
                        System.out.println("created dir");
                        break;
                    case "cf":
                        new File(vec[1]).createNewFile();
                        System.out.println("created file");
                        break;
                    case "remove":
                        File f1 = new File(vec[1]);
                        boolean b = f1.delete();
                        if (b) {
                            System.out.println("deleted");
                        } else {
                            System.out.println("not deleted");
                        }
                        break;
                    case "list":
                        String[] files = new File(vec[1]).list();
                        Arrays.asList(files).forEach(System.out::println);
                        break;
                }
            }
        } catch (Exception e) {

        }
    }
}
