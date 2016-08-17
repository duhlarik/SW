package midterm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {

	private static int quantity;
	private static double subTotal;
	public static String ItemNum;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		Catalog.quantity = quantity;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public static void printItemsList(ArrayList<item> itemsList) {

		Scanner scan1 = new Scanner(System.in);

		String input = scan1.nextLine();

		while (!(input.equalsIgnoreCase("shoes") || input.equalsIgnoreCase("clothes")
				|| input.equalsIgnoreCase("hair care"))) {
			System.out.println("That's not a valid department. Please enter \"shoes,\" \"clothes,\" or \"hair care.\"");
			input = scan1.nextLine();
		}

		for (int j = 0; j < itemsList.size(); j++) {
			if (input.equalsIgnoreCase(itemsList.get(j).getItemType())) {

				System.out.print(itemsList.get(j).getItemType() + ", ");
				System.out.print(itemsList.get(j).getItemName() + ", ");
				System.out.print(itemsList.get(j).getItemPrice() + ", ");
				System.out.print(itemsList.get(j).getItemNum() + ", ");
				System.out.print(itemsList.get(j).getItemDescrip());

				System.out.println();

			}
		}

	}

	public static double placeOrder2(ArrayList<item> itemsList, Scanner scan1, String itemNum) {
		double price = 0;
		DecimalFormat df = new DecimalFormat ("#.00");

		System.out.println("What would you like to order? Enter item number.");

		itemNum = scan1.nextLine();

		for (int j = 0; j < itemsList.size(); j++) {
			if (itemNum.equalsIgnoreCase(itemsList.get(j).getItemNum())) {

				price = itemsList.get(j).getItemPrice();
				
				System.out.print(price); // TEST
			}
		}

		System.out.println("How many? Enter quantity.");

		int input2 = scan1.nextInt();

		quantity = input2;

		double extendedPrice = quantity * price;

		System.out.println("Your subtotal is $" + df.format(extendedPrice));

		subTotal += extendedPrice;

		return subTotal;
	}
}
