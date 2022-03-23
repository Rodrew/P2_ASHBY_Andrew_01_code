package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class Main {
    public static void main(String args[]) {
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
        WriteSymptomDataResultOut writer = new WriteSymptomDataResultOut();
        AnalyticsCounter counter = new AnalyticsCounter();

        // lire mon fichier
        List<String> data = reader.getSymptoms();

        //On compte le nombre d'occurence
        TreeMap<String, Integer> occurence = counter.countSymptoms(data);
        try{
            writer.writeSymptoms(occurence);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
