package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    public TreeMap<String, Integer> getSymptoms() {
        TreeMap<String, Integer> result = new TreeMap<>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                Scanner scanner = new Scanner(reader);

                while (scanner.hasNext()) { //lecture du fichier
                    String line = scanner.nextLine(); //déclaration de la chaine line
                    Integer count = result.get(line); //
                    if (count != null) {
                        result.put(line, count + 1);
                    } else {
                        result.put(line, 1);
                    }
                }
                /*for (Map.Entry<String, Integer> entry : result.entrySet()) {
                    System.out.println(" " + entry.getKey() + ":" + entry.getValue());
                }*/
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
