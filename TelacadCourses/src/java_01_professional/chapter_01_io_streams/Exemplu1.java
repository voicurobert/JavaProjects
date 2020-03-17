package java_01_professional.chapter_01_io_streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplu1 {

    public static void main(String[] args) {
        // cream un flux high level - BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder(line);
            stringBuilder.reverse();
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
