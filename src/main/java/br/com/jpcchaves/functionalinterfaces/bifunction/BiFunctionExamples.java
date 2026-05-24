package br.com.jpcchaves.functionalinterfaces.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExamples {

    public static void main(String[] args) {

        // Example 1
        BiFunction<String, String, String> concatString = (s1, s2) -> s1 + s2;
        var result = concatString.apply("First", "Second");

        System.out.println(result);

        Function<String, String> toUpperCase = String::toUpperCase;

        String resultConcatUpper = concatString.andThen(toUpperCase).apply("te", "st");
        System.out.println(resultConcatUpper);

        // Example 2
        BiFunction<Integer, Integer, Integer> add = Integer::sum;
        System.out.println(add.apply(1, 2));

        Function<Integer, String> convertToString = String::valueOf;
        System.out.println(add.andThen(convertToString).apply(30, 6));
    }
}
