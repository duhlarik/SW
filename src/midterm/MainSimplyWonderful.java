package midterm;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainSimplyWonderful {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		File f = new File("items.txt");

		ArrayList<item> itemsList = CreateArray.addItemsList(f);

		System.out.println("Welcome to Simply Wonderful.\n");

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("What department would you like to shop in?");
			
			String input = scan1.nextLine();

			while (!(input.equalsIgnoreCase("shoes") || input.equalsIgnoreCase("clothes")
					|| input.equalsIgnoreCase("hair care"))) {
				System.out.println("That's not a valid department. Please enter \"shoes,\" \"clothes,\" or \"hair care.\"");
				input = scan1.nextLine();
			}

			Catalog.printItemsList(itemsList, input);

			Catalog.placeOrder2(itemsList, scan1, Catalog.ItemNum);
			
			System.out.println("Do you want to continue shopping?");
			
			choice = scan1.nextLine();

		}

		if (choice.equalsIgnoreCase("no")) {
		Checkout ckout = new Checkout();
		ckout.paymentInfo();
		
		}

	}
}
