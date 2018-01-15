import java.util.Scanner;

import model.Item;
import service.TaxCalculate;
import service.builder.TaxCalculatorFactory;

/**
 * Calculate the tax of for raw/manufactured/imported material
 * 
 * @author nishantgarg
 * 
 */
public class App {
/*
 * 
 */
	
	/**
	 * Calculate the tax of for raw/manufactured/imported material
	 * 
	 */
	public static void main(String[] args) {
		TaxCalculatorFactory assignTax = new TaxCalculatorFactory();
		TaxCalculate taxCalculate = null;
		int countIteam = 0;
		Item item;
		Scanner sc = new Scanner(System.in);
		while (1 > 0) {
			item = takeItem();
			if (item!=null && item.isValid()) {
				taxCalculate = assignTax.assigntax(item.getType());
				try {
					item.setTax(taxCalculate.calculate(item.getPrice()));
					item.display();
					countIteam++;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			String choice;
			System.out.println("Do you want to enter details of any other item (y/n):");
			choice = sc.next().toLowerCase();
			while (choice.length() > 1 || (!choice.equals("y") && !choice.equals("n"))) {
				System.err.println("press 'N/n' or  'Y/y'");
				choice = sc.next().toLowerCase();
			}
			if (choice.equals("n"))
				break;
		}

		System.out.println("Thanks You..  you have enter " + countIteam + " items ");
	}

	public static Item takeItem() {
		boolean flag = true;
		Item item = new Item();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Name of the product:");
		item.setName(sc.nextLine());
		System.out.println("Please enter Price of the product:");
		if (sc.hasNextDouble()) {
			item.setPrice(sc.nextDouble());
			System.out.println("Please enter Quantity of the product:");
		} else {
			flag = false;
		}
		if (sc.hasNextInt()) {
			item.setQuantity(sc.nextInt());
			System.out.println("Please enter Type of the product:");
			item.setType(sc.next().toLowerCase());
		} else {
			flag = false;
		}
		if (!flag) {
			System.err.println("Invalid price or quantity");
			return null;
		}
		return item;

	}
}
