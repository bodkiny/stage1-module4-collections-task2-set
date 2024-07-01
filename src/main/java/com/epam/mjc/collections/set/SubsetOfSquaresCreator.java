package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        if (sourceList.isEmpty()) {
            return new HashSet<>();
        }

        TreeSet<Integer> integers = new TreeSet<>();
        for (Integer i : sourceList) {
            integers.add(i * i);
        }

        return integers.subSet(lowerBound, true, upperBound, true);
    }
}
