package java_associate.chapter_08_tipuri_generice_si_colecti;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class Exemplu8 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 2, 5);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(50);       // insereaza un element la inceputul colectiei
        deque.pop();               //  returneaza primul element si il elimina sau intoarce o exceptie
        deque.poll();               // returneaza primul element si il elimina sau intoarce null
        deque.peek();               // ia primul element din deque dar nu il elimina
        deque.offer(45);      // adauga elementul la coada

        // hashset foloseste hashcode-ul instantelor pentru a le compara si a le cauta

    }

}
