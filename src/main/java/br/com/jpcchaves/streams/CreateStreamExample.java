package br.com.jpcchaves.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamExample {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

        Stream<String> fruitStream = fruits.stream();
        fruitStream.forEach(System.out::println);

        Set<String> fruitsSet = Set.of("apple", "banana", "orange");
        Stream<String> fruitSetStream = fruitsSet.stream();
        fruitSetStream.forEach(System.out::println);

        Map<String, Integer> fruitMap = Map.of("apple", 1, "banana", 2, "orange", 3);
        Stream<Map.Entry<String, Integer>> fruitMapStream = fruitMap.entrySet().stream();
        fruitMapStream.forEach(value -> System.out.println(value.getKey() + " -> " + value.getValue()));

        Stream<String> fruitMapStreamKeys = fruitMap.keySet().stream();
        fruitMapStreamKeys.forEach(System.out::println);

        Stream<Integer> fruitMapStreamValues = fruitMap.values().stream();
        fruitMapStreamValues.forEach(System.out::println);

        String[] strArr = {"Apple", "Banana", "Orange"};
        Stream<String> strArrStream = Arrays.stream(strArr);
        strArrStream.forEach(System.out::println);
    }
}
