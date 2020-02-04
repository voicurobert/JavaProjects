package java_professional.chapter_04_streams_threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplu5 {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("aa", "bbb", "ccc", "d"));
        list.add(Arrays.asList("aaaaa", "bvbb", "ccc", "d"));
        list.add(Arrays.asList("a", "bbbbb", "cccsdadasda", "dasaddda"));

        list.stream().flatMap(strings -> strings.stream());
    }

}
