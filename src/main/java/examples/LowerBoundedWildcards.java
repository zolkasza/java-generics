package examples;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        // Lower Bounded Wildcards
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList();
        printNumbers(list2);
        printNumbers(list3);
    }

    // ? super Integer -> olyan class amiBŐL az Integer származik le, vagy az Integer maga
    // csak egyet lehet beírni
    static void printNumbers(List<? super Integer> list) {
        list.forEach(e -> {
            System.out.println(e.getClass().getName());
            System.out.println(e);
        });
    }
}
