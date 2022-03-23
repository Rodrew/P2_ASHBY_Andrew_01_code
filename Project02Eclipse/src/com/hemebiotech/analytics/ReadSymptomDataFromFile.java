package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    public List<String> getSymptoms() {
        List<String> listStr = new ArrayList<>();

        if (filepath != null) {
            try {
                BufferedReader readerFile = new BufferedReader(new FileReader(filepath));
                Scanner scannerFile = new Scanner(readerFile);

                while (scannerFile.hasNextLine()) { //lecture du fichier
                    String line = scannerFile.nextLine();
                    listStr.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listStr;
    }
}
