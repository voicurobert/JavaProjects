package java_01_professional.chapter_03_streams;

import java.util.Arrays;
import java.util.List;

public class Exemplu9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 3, 5, 7, 8);
        int s = list.stream().distinct().mapToInt(value -> value).sum();
    }
}
