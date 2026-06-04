package br.com.jpcchaves.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatmapExample {

    public static void main(String[] args) {
        List<List<Integer>> listOfListInt = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));

        Stream<List<Integer>> streamOfListInt = listOfListInt.stream();

        List<Integer> singleList = streamOfListInt.flatMap(list -> list.stream()).toList();

        System.out.println(singleList);


        String[][] strArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};

        Stream<String[]> streamArray = Arrays.stream(strArray);
        Stream<String> streamStr = streamArray.flatMap(strArr -> Arrays.stream(strArr));
        System.out.println(streamStr.toList());
    }
}
