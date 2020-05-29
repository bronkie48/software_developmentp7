package Oefening_7_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Bestand {
	// Make a list with stats (date, number of views)
	TreeMap<String, String> list = new TreeMap<String, String>(Collections.reverseOrder());
	
	// Retrieve a String value of the current date
	Date todayDate = Calendar.getInstance().getTime();
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	String today = dateFormat.format(todayDate);
			
	public void checkFile() {
		// Read the file and fill the list with entries.
		try (BufferedReader reader = new BufferedReader(new FileReader("assets/stats.csv"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] values = line.split(",");
				list.put(values[0], values[1]);
			}
			reader.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printStoredList() {
		// Debug: print the stored list
		System.out.println("Debug: Stored list");
		System.out.format("%10s%10s\n", "date", "views");
		for (Map.Entry<String, String> entry : list.entrySet()) {
			System.out.format("%10s%10s\n", entry.getKey(), entry.getValue());
		}
	}
	
	
	public void printNewList() {
		// Print the new list
		System.out.println("---------");
		System.out.println("Debug: Updated list");
		System.out.format("%10s%10s\n", "date", "views");
		for (Map.Entry<String, String> entry : list.entrySet()) {
			System.out.format("%10s%10s\n", entry.getKey(), entry.getValue());
		}
	}
	
	public void saveList() {
		// Save the new list
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("assets/stats.csv"))) {
			for (Map.Entry<String, String> entry : list.entrySet()) {
				writer.write(entry.getKey() + "," + entry.getValue() + ",\n");
			}
			writer.flush();
			writer.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void checkEntry() {
		// Check if today is already a key in the list, and update
		if (list.get(today) != null) {
			int count = Integer.valueOf(list.get(today)) + 1;
			list.put(today, String.valueOf(count));
		} else {
			list.put(today, "1");
		}
	}
}
