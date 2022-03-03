package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile(String filepath) {

        this.filepath = filepath;
    }

    @Override
    public Map<String, Integer> GetSymptoms() {
        Map<String, Integer> result = new HashMap<>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                Scanner scanner = new Scanner(reader);
                //String line = reader.readLine();

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    result.put(line, 0);
                    result.putIfAbsent(line,0);
                    result.put(line, result.get(line)+1);
                    //line = reader.readLine();
                    //System.out.println(" - " + line);
                    }
                for(Map.Entry<String, Integer> entry: result.entrySet()){
                    System.out.println(" "+ entry.getKey() + ":" + entry.getValue());
                }
                //reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
