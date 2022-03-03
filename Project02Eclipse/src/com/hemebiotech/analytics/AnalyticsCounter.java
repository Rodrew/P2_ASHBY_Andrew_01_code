package com.hemebiotech.analytics;

import java.io.FileWriter;


public class AnalyticsCounter {


	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile result = new ReadSymptomDataFromFile("/home/andrew/Documents/git/project2/Project02Eclipse/symptoms.txt");
		FileWriter writer = new FileWriter("result.out");

		result.GetSymptoms();


		writer.close();
	}
}




