package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
            int key = e.getKey().length();
            String value = e.getKey();

            if (result.containsKey(key)) {
                result.get(key).add(value);
            } else {
                result.put(key, new HashSet<>(List.of(value)));
            }
        }
        return result;
    }
}
