package br.com.jpcchaves.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsExample {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Strawberry");

        List<String> fruitsAlphabeticalOrder = fruits.stream().sorted().toList();

        System.out.println(fruitsAlphabeticalOrder);

        List<String> fruitsReverseAlphabeticalOrder = fruits.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println(fruitsReverseAlphabeticalOrder);
    }
}
