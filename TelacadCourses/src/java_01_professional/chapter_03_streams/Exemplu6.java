package java_01_professional.chapter_03_streams;

import java.util.Arrays;
import java.util.List;


public class Exemplu6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ana", "bere", "curs");

        int sum = list.stream()
                      .map(String::length)
                      
                      .reduce(0, (integer, integer2) -> integer + integer2);
        double sum2 = list.stream().mapToInt(String::length).average().getAsDouble();

        System.out.println(sum / list.size());

    }
}
