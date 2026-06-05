package br.com.jpcchaves.streams.sorted;

import java.util.Comparator;
import java.util.List;

public class SortedExample {

    public static void main(String[] args) {

        List<Integer> numbers =  List.of(5, 4, 2, 3, 1, 6, 7, 8, 9);

        // Natural order (ascending)
        List<Integer> result = numbers.stream().sorted().toList();

        System.out.println(result);

        // Descending order
        List<Integer> resultDescending = numbers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(resultDescending);


    }
}
