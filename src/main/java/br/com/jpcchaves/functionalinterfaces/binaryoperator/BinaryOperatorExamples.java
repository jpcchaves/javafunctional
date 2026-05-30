package br.com.jpcchaves.functionalinterfaces.binaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorExamples {

    public static void main(String[] args) {
        BinaryOperator<String> concatString = (a, b) -> a + b;
        System.out.println("Concat strings: " + concatString.apply("a", "b"));

        BinaryOperator<Integer> sumInt = Integer::sum;
        Function<Integer, String> convertToString = String::valueOf;

        System.out.println(sumInt.andThen(convertToString).apply(17, 22));
    }
}
