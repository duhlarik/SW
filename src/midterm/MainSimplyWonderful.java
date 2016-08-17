package midterm;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
//import Catalog;

public class MainSimplyWonderful {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		File f = new File("items.txt");

		ArrayList<item> itemsList = CreateArray.addItemsList(f);
		
/*		for (int j = 0; j < itemsList.size(); j++) {
			

				System.out.print(itemsList.get(j).getItemType() + ", ");
				System.out.print(itemsList.get(j).getItemName() + ", ");
				System.out.print(itemsList.get(j).getItemPrice() + ", ");
				System.out.print(itemsList.get(j).getItemNum() + ", ");
				System.out.print(itemsList.get(j).getItemDescrip());

				System.out.println();

			
		}*/
		

		System.out.println("Welcome to Simply Wonderful.");

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {
			
			System.out.println("What department would you like to shop in?");
			
			Catalog.printItemsList(itemsList);
			
			Catalog.placeOrder1(scan1);
			
			Catalog.placeOrder2(itemsList, scan1, Catalog.ItemNum);
			
			System.out.println("Do you want to look at another department?");
			
			choice = scan1.nextLine();
		}
		
		 
		 scan1.close();
		 

	}
}
