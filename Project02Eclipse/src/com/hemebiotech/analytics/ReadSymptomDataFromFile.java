package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

    /**
     * getSymptoms() used to read a file, count the number of occurrences classified by
     * alphabetical order
     * @return TreeMap key and value in an alphabetically arranged
     */
    @Override
    public TreeMap<String, Integer> getSymptoms() {
        TreeMap<String, Integer> result = new TreeMap<>();

        if (filepath != null) {
            try {
                BufferedReader readerFile = new BufferedReader(new FileReader(filepath));
                Scanner scannerFile = new Scanner(readerFile);

                while (scannerFile.hasNext()) { //lecture du fichier
                    String line = scannerFile.nextLine();
                    Integer countValue = result.get(line);
                    if (countValue != null) {
                        result.put(line, countValue + 1);
                    } else {
                        result.put(line, 1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
