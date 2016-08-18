package midterm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Checkout {

	private double tax;
	private double grandTotal;
	private String payType;
	private double cashTendered;
	private double cashChange;
	private int checkNum;
	private String ccNum;
	private String expDate;
	private int cvv;

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public double getCashTendered() {
		return cashTendered;
	}

	public void setCashTendered(double cashTendered) {
		this.cashTendered = cashTendered;
	}

	public double getCashChange() {
		return cashChange;
	}

	public void setCashChange(double cashChange) {
		this.cashChange = cashChange;
	}

	public int getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(int checkNum) {
		this.checkNum = checkNum;
	}

	public String getCcNum() {
		return ccNum;
	}

	public void setCcNum(String ccNum) {
		this.ccNum = ccNum;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public int getCvv() {
		return cvv;
 	}

	public void paymentInfo() {
		
		DecimalFormat df = new DecimalFormat ("#.00");
		double tax = 0.06;
		Catalog sTotal = new Catalog();
		double totalTax = sTotal.getSubTotal() * tax;
		double grandTotal = totalTax + sTotal.getSubTotal();
		System.out.println("\nSubtotal: $" + df.format(sTotal.getSubTotal()));
		System.out.println();
		System.out.println("Tax due: $" + df.format(totalTax));
		System.out.println();
		System.out.println("Total due: $" + df.format(grandTotal));
		System.out.println();
		System.out.println("How do you want to pay? (check/cash/charge)");
		Scanner scan1 = new Scanner(System.in);
		String payType = scan1.nextLine();

		if (payType.equalsIgnoreCase("cash")) {
			System.out.println("Cash tendered? ");
			cashTendered = scan1.nextDouble();
			cashChange = cashTendered - grandTotal;
			System.out.println("Your change is $" + df.format(cashChange));
		}

		else if (payType.equalsIgnoreCase("check")) {
			System.out.println("Please enter check number: ");
			checkNum = scan1.nextInt();
			System.out.println("Thank you for check number " + checkNum);
		}

		else if (payType.equalsIgnoreCase("charge")) {
			System.out.println("Please enter your CC number: ");
			ccNum = scan1.next();
			System.out.println("Please enter the expiration date: ");
			expDate = scan1.next();
		}
	}
}