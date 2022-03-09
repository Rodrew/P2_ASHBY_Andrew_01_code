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
        ReadSymptomDataFromFile result = new ReadSymptomDataFromFile("/home/andrew/Documents/git/project2/Project02Eclipse/symptoms.txt");
        FileWriter writer = null;
        try {
            writer = new FileWriter("result.out");
            for (Map.Entry<String, Integer> entry : result.getSymptoms().entrySet()) {
                writer.write(" " + entry.getKey() + ":" + entry.getValue() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}




