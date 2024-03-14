package com.epam.mjc.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for (int i : sourceList) {
            if (i % 2 == 0) {
                while (i % 2 == 0) {
                    resultSet.add(i);
                    i = i / 2;
                }
                resultSet.add(i);
            } else {
                resultSet.add(i);
                resultSet.add(2 * i);
            }
        }

        return resultSet;
    }
}
