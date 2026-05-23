package br.com.jpcchaves.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args) {
        // Recebe um argumento e retorna um boolean com base nisso (geralmente usado para verificacoes)
        Predicate<String> isGreaterThanFive = strArg -> strArg.length() > 5;
        System.out.println(isGreaterThanFive.test("Testes"));
        System.out.println(isGreaterThanFive.test("Teste"));

        Predicate<String> isLessThanTen = strArg -> strArg.length() < 10;
        System.out.println(isLessThanTen.test("Testes"));
        System.out.println(isLessThanTen.test("Teste"));

        // Composicao de predicates
        Predicate<String> isGreaterThanFiveAndLessThanTen = isGreaterThanFive.and(isLessThanTen);
        System.out.println(isGreaterThanFiveAndLessThanTen.test("Testes"));
        System.out.println(isGreaterThanFiveAndLessThanTen.test("Test"));

        Predicate<String> isGreaterThanFiveOrLessThanTenAndLessThan = isGreaterThanFive.or(isLessThanTen);
        System.out.println(isGreaterThanFiveOrLessThanTenAndLessThan.test("Testes"));
        System.out.println(isGreaterThanFiveOrLessThanTenAndLessThan.test("MoreThanTenCharacters"));

        Predicate<String> negateTest = strArg -> strArg.length() > 0;
        System.out.println(negateTest.negate().test("test"));
    }
}
