package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int coughCount = 0;

	public static void main(String args[]) throws Exception {

		//ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("/home/andrew/Documents/git/project2/Project02Eclipse/symptoms.txt");
		BufferedReader reader = new BufferedReader(new FileReader("/home/andrew/Documents/git/project2/Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();


		//int i = 0;
		//int headCount = 0;
		while (line != null) {
			//i++;
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headacheCount++;
			} else if (line.equals("rash")) {
				rashCount++;
			} else if (line.equals("cough")) {
				coughCount++;
			}

			line = reader.readLine();    // get another symptom*/


			FileWriter writer = new FileWriter("result.out");
			//writer.write("liste:" + result.GetSymptoms());
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("cough: " + coughCount+ "\n");
			writer.close();
		}
	}
}
