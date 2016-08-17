package midterm;

public class item {

	private String itemType;
	private String itemDescrip;
	private double itemPrice;
	private String itemName;
	private String itemNum;
	
	public item (String itemType, String itemName, double itemPrice, String itemNum, String itemDescrip) {
		setItemType(itemType);
		setItemName(itemName);
		setItemPrice(itemPrice);
		setItemNum(itemNum);
		setItemDescrip(itemDescrip);
		
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemDescrip() {
		return itemDescrip;
	}

	public void setItemDescrip(String itemDescrip) {
		this.itemDescrip = itemDescrip;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemNum() {
		return itemNum;
	}

	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}

	

}
