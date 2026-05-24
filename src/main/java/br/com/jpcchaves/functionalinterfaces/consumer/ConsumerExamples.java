package br.com.jpcchaves.functionalinterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerExamples {

    public static void main(String[] args) {
        Consumer<String> consumerTest = System.out::println;

        consumerTest.accept("Test Consume takes one argument but don't return anything");

        Consumer<String> printUppercase = strArg -> System.out.println(strArg.toUpperCase());
        Consumer<String> printLowercase = strArg -> System.out.println(strArg.toLowerCase());

        printUppercase.accept(ConsumerExamples.class.getName());
        printLowercase.accept(ConsumerExamples.class.getName());

        Consumer<String> print = System.out::println;

        Consumer<String> toUppercaseAndThenPrint = printUppercase.andThen(print);
        toUppercaseAndThenPrint.accept(ConsumerExamples.class.getName());
    }
}
