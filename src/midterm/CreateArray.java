package midterm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CreateArray {
	
	public static ArrayList<item> addItemsList(File fileName) {

		ArrayList<item> itemsList;

		try {
			itemsList = new ArrayList<item>();

			BufferedReader input = new BufferedReader(new FileReader(fileName));
			// for each line
			for (String line = input.readLine(); line != null; line = input.readLine()) {
				String [] ar = line.split(",");
				
				itemsList.add(new item(ar[0], ar[1], Double.parseDouble(ar[2]), ar[3], ar[4]));
			}
			input.close();

		} catch (IOException e) {

			e.printStackTrace();

			return null;
		}
		return itemsList;
	}
}
