package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;


public class AnalyticsCounter {
    /**
     * countSymptoms calculates the number of occurrences and classifies them in alphabetical order
     * @return TreeMap
     */

    public AnalyticsCounter() {

    }

    public TreeMap<String, Integer> countSymptoms (List<String> data) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();//création d'une treemap
        for (String str : data) {//lecture de la list data
            Integer countValue = treeMap.get(str);
            if (treeMap.containsKey(str)) {
                treeMap.put(str, countValue + 1);//si str présent plusieurs fois incrémente la valeur
            } else {
                treeMap.put(str, 1);//sinon laisse la valeur 1
            }

        }
        return treeMap;
    }
}





