package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()) {
            if (e.getValue().contains(developer)) {
                result.add(e.getKey());
            }
        }

        result.sort(((Comparator<String>) (x, y) -> {
            if (x.length() > y.length()) {
                return 1;
            } else if (x.length() < y.length()) {
                return -1;
            }
            return x.compareTo(y);
        }).reversed());

        return result;
    }
}
