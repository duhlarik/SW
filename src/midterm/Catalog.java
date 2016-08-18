package midterm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {

	private int quantity;
	private static double subTotal;
	public static String ItemNum;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public static void printItemsList(ArrayList<item> itemsList, String input) {

		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.format("%-10s%-30s%-8s%-7s%-46s","Dept.","Product","Price","Number", "Description");
		System.out.println();
		System.out.println("====================================================================================================");

		for (int j = 0; j < itemsList.size(); j++) {
			if (input.equalsIgnoreCase(itemsList.get(j).getItemType())) {
				System.out.format("%-10s%-30s%-8s%-7s%-46s",itemsList.get(j).getItemType(), itemsList.get(j).getItemName(), "$" + df.format(itemsList.get(j).getItemPrice()), itemsList.get(j).getItemNum(), itemsList.get(j).getItemDescrip());
				System.out.println();

			}
		}
	}

	public static double placeOrder2(ArrayList<item> itemsList, Scanner scan1, String itemNum) {
		double price = 0;
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.println("\nWhat would you like to order? Enter item number.");

		itemNum = scan1.nextLine();

		for (int j = 0; j < itemsList.size(); j++) {
			if (itemNum.equalsIgnoreCase(itemsList.get(j).getItemNum())) {

				price = itemsList.get(j).getItemPrice();
			}
		}

		System.out.println("How many? Enter quantity.");

		int input2 = scan1.nextInt();
		scan1.nextLine();

		int quantity = input2;

		double extendedPrice = quantity * price;

		System.out.println("Your subtotal is $" + df.format(extendedPrice));

		subTotal += extendedPrice;

		return subTotal;
	}
}
