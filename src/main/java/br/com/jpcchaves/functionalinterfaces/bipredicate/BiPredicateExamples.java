package br.com.jpcchaves.functionalinterfaces.bipredicate;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class BiPredicateExamples {
    public static Supplier<List<Integer>> ALLOWANCE_LIST = () -> List.of(17, 22);

    public static Consumer<Boolean> PRINT = System.out::println;

    public static void main(String[] args) {
        var allowanceList = ALLOWANCE_LIST.get();
        BiPredicate<Integer, Integer> numberIsAllowed = (a1, a2) -> allowanceList.contains(a1) && allowanceList.contains(a2);

        PRINT.accept(numberIsAllowed.test(17, 22));
        PRINT.accept(numberIsAllowed.test(17, 22));

        BiPredicate<Integer, Integer> notNegative = (a1, a2) -> a1 > 0 && a2 > 0;

        PRINT.accept(numberIsAllowed.and(notNegative).test(17, 22));

        BiPredicate<Integer, Integer> notZero = (a1, a2) -> a1 != 0 && a2 != 0;

        PRINT.accept(numberIsAllowed.and(notZero).test(17, 22));

        PRINT.accept(numberIsAllowed.negate().test(17, 22));
    }
}
