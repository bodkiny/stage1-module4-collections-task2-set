package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> elementsThatBelongToFirstAndSecondAndNotToThird = new HashSet<>(firstSet);
        elementsThatBelongToFirstAndSecondAndNotToThird.retainAll(secondSet);
        elementsThatBelongToFirstAndSecondAndNotToThird.removeAll(thirdSet);

        Set<String> elementsThatBelongToOnlyThird = new HashSet<>(thirdSet);
        elementsThatBelongToOnlyThird.removeAll(firstSet);
        elementsThatBelongToOnlyThird.removeAll(secondSet);

        elementsThatBelongToFirstAndSecondAndNotToThird.addAll(elementsThatBelongToOnlyThird);

        return elementsThatBelongToFirstAndSecondAndNotToThird;
    }
}
