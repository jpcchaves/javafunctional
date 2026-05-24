package br.com.jpcchaves.functionalinterfaces.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerExamples {

    public static void main(String[] args) {
        BiConsumer<String, String> concatFirstAndLastName = (s1, s2) -> System.out.println("Result: " + s1 + " " + s2);

        concatFirstAndLastName.accept("John", "Smith");
        concatFirstAndLastName.accept("Zezin", "Junior");

        BiConsumer<String, String> toUpperCase = (s1, s2) -> System.out.println("Result: " + s1.toUpperCase() + " " + s2.toUpperCase());

        concatFirstAndLastName.andThen(toUpperCase).accept("John", "Smith");


        BiConsumer<Integer, Integer> printNumbers = (n1, n2) -> System.out.println("Numbers: " + n1 + " " + n2);
        printNumbers.accept(17, 22);

        BiConsumer<Integer, Integer> sumNumbers = (n1, n2) -> System.out.print("Sum: " + (n1 + n2));
        sumNumbers.accept(17, 22);
    }
}
