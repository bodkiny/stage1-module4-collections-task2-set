package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        if (sourceList.isEmpty()) {
            return new HashSet<>();
        }

        HashSet<Integer> integers = new HashSet<>();
        for (Integer i : sourceList) {
            int x = i;
                if (integerIsEven(x)) {
                    addIntegersWhileTheyAreEven(x, integers);
                } else {
                    addIntegerAndTwiceItsValue(integers, x);
                }
        }

        return integers;
    }

    private static void addIntegerAndTwiceItsValue(Set<Integer> integers, int x) {
        integers.add(x);
        integers.add(2 * x);
    }

    private static void addIntegersWhileTheyAreEven(int x, Set<Integer> integers) {
        while (integerIsEven(x)) {
            integers.add(x);
            x /= 2;
            integers.add(x);
        }
    }

    private static boolean integerIsEven(int x) {
        return (x & 1) != 1;
    }
}
