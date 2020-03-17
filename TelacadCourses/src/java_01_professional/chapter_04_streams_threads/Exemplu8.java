package java_01_professional.chapter_04_streams_threads;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exemplu8 {
    public static void main(String[] args) {
        List<Pisica> list = Arrays
                .asList(new Pisica("pablo", "gri"), new Pisica("cat", "verde"), new Pisica("alfo", "negru"));

        Map<String, String> map = list.stream()
                                      .collect(Collectors.toMap(pisica -> pisica.getNume(), Pisica::getCuloare));
        System.out.println(map);
    }
}
