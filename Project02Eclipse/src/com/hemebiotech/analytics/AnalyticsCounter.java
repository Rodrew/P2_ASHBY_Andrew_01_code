package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {

    public AnalyticsCounter() {

    }

    public TreeMap<String, Integer> countSymptoms (List<String> data) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String str : data) {
            Integer countValue = treeMap.get(str);
            if (treeMap.containsKey(str)) {
                treeMap.put(str, countValue + 1);
            } else {
                treeMap.put(str, 1);
            }

        }
        return treeMap;
    }
}





