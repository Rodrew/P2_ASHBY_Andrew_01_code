package com.hemebiotech.analytics;

public class AnalyticsCounter {


    public static void main(String args[]) {
        /**
         * Using the ISymptomReader interface to read the symptoms.txt file and place
         * its contents in an alphabetically arranged collection and we write the result in
         * the file:"result.out"
         */
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
        WriteSymptomDataResultOut writer = new WriteSymptomDataResultOut();
        try{
            writer.writeSymptoms(reader.getSymptoms());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}





