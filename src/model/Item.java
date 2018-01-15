package model;

public class Item {
	private String name;
	private double price;
	private String type;
	private int quantity;
	private double tax;

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isValid() {
//		if(this == null)return false;
		if (this.name == null) {
			System.err.println("Item name not provided!");
			return false;
		}
		if((!this.type.equals("raw") && !this.type.equals("manufactured") && !this.type.equals("imported")) )
		{
			System.err.println("Item type is not valid");
			return false;
		}
		return true;
	}

	public void display() {
		System.out.println("item name S: " + this.name + "\nitem Price " + Math.round(this.getPrice() * 1000) / 1000.0d
				+ "\nSales tax liability per item " + this.tax
				+ "\nFinal price (sales tax + item price) " + (this.tax + this.price));
	}

}
