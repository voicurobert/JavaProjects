package java_professional.chapter_01_io_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplu2 {

    public static void main(String[] args) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = bufferedReader.readLine();
            Double d1 = Double.parseDouble(line);
            line = bufferedReader.readLine();
            Double d2 = Double.parseDouble(line);
            System.out.println(d1 + d2);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {

            }
        }

        // try cu resurse
        try (BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in))) {
            String line = bufferedReader2.readLine();
            Double d1 = Double.parseDouble(line);
            line = bufferedReader2.readLine();
            Double d2 = Double.parseDouble(line);
            System.out.println(d1 + d2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
