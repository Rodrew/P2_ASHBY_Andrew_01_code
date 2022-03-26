package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
/**
 * Write the result in the file:"result.out"
 */
public class WriteSymptomDataResultOut{

    public WriteSymptomDataResultOut(){

    }

    /**
     * Used to write the result in the file:"result.out"
     * @param data
     * @throws IOException
     */

    public void writeSymptoms(TreeMap<String, Integer> data) throws IOException {

        FileWriter writer = null;
        try {
            writer = new FileWriter("result.out");//ouverture du fichier "result.out"
            for (Map.Entry<String, Integer> entry : data.entrySet()) {
                writer.write(" " + entry.getKey() + ":" + entry.getValue() + "\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            writer.close(); //fermeture du fichier "result.out"
        }

    }
}
