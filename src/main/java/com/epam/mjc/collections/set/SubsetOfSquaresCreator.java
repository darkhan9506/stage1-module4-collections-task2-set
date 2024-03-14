package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        for (int i : sourceList) treeSet.add((int) Math.pow(i, 2));
        return treeSet.subSet(lowerBound, true, upperBound, true);
    }
}
