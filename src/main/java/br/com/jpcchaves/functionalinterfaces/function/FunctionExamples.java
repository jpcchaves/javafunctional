package br.com.jpcchaves.functionalinterfaces.function;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

public class FunctionExamples {

    public static void main(String[] args) {

        // Recebe um argumento T, realiza um processamento e retorna um valor R
        Function<String, String> toUpperCase = argStr -> StringUtils.upperCase(argStr);
        Function<String, String> trimString = argStr -> StringUtils.trim(argStr);

        System.out.println(toUpperCase.apply("Testes"));
        System.out.println(trimString.apply("   Testes   "));

        // Encadeamento de functions

        // andThen -> executa a function passada como argumento apos a function principal
        Function<String, String> strimThenUppercase = trimString.andThen(toUpperCase);
        System.out.println(strimThenUppercase.apply("   Testes   "));

        // compose -> executa a function passada como argumento antes da function principal
        Function<String, String> incrementString = str -> str + " Incremented String";
        System.out.println(toUpperCase.compose(incrementString).apply("Testes"));

        // Identity retorna o proprio argumento
        Function<String, String> stringIdentity = Function.identity();
        System.out.println(stringIdentity.apply("Testes"));
    }
}
