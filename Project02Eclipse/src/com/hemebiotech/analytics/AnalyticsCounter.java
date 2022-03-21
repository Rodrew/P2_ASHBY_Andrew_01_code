package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;


public class AnalyticsCounter {


    public static void main(String args[]) {
        /**
         * Using the ISymptomReader interface to read the symptoms.txt file and place
         * its contents in an alphabetically arranged collection and we write the result in
         * the file:"result.out"
         */
        ReadSymptomDataFromFile result = new ReadSymptomDataFromFile("symptoms.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter("result.out");
            for (Map.Entry<String, Integer> entry : result.getSymptoms().entrySet()) {
                writer.write(" " + entry.getKey() + ":" + entry.getValue() + "\n");
            }
            writer.close(); //fermeture du fichier "result.out"
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





