package br.com.jpcchaves.streams.map;

import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {

    public static void main(String[] args) {
        List<String> fruit = List.of("Apple", "Banana", "Orange");

        Stream<String> fruitStream = fruit.stream();

        var fruitList = fruitStream
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .peek(System.out::println)
                .map(element -> {
                    String firstHalf = element.substring(0, (element.length() / 2)).toLowerCase();
                    String lastHalf = element.substring(element.length() / 2).toUpperCase();
                    return firstHalf + lastHalf;
                })
                .peek(System.out::println)
                .toList();

        System.out.println(fruitList);



    }
}
