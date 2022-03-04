package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;


public class AnalyticsCounter {


	public static void main(String args[]) throws Exception {
		/**
		 * Using the ISymptomReader interface to read the symptoms.txt file and place
		 * its contents in an alphabetically arranged collection
		 */

		ReadSymptomDataFromFile result = new ReadSymptomDataFromFile("/home/andrew/Documents/git/project2/Project02Eclipse/symptoms.txt");
		FileWriter writer = new FileWriter("result.out");

		for(Map.Entry<String, Integer> entry: result.GetSymptoms().entrySet()){
			writer.write(" "+ entry.getKey() + ":" + entry.getValue()+"\n");
		}
		writer.close();
	}
}




