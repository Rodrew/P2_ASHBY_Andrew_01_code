package com.hemebiotech.analytics;

public class AnalyticsCounter {


    public static void main(String args[]) {
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
        WriteSymptomDataResultOut writer = new WriteSymptomDataResultOut();
        try{
            writer.writeSymptoms(reader.getSymptoms());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}





