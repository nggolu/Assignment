package view;

import java.util.Scanner;

import java.util.regex.Pattern;

import model.Item;
import controller.*;

/** 
 * Calculate the tax of for raw/manufactured/imported material
 * @author nishantgarg
 * 
 */
public class Index {
	/**
	 * Calculate the tax of for raw/manufactured/imported material
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(1>0)
		{
			Item item  = new Item();
			Scanner sc  = new Scanner(System.in);
			System.out.println("Please enter Name of the product:");
			item.setName(sc.nextLine());
			System.out.println("Please enter Price of the product:");
			item.setPrice(sc.nextDouble());
			System.out.println("Please enter Quantity of the product:");
			item.setQuantity(sc.nextInt());
			System.out.println("Please enter Type of the product:");
			item.setType(sc.next().toLowerCase());
			
			while(!item.getType().equals("raw") && !item.getType().equals("manufactured") && !item.getType().equals("imported"))
			{
				System.out.println("Bhai enter one of these raw/manufactured/imported type");
				item.setType(sc.next().toLowerCase());
			}
			TaxCalculate taxCalculate;
			taxCalculate=null;
			if(item.getType().equals("raw")){
				taxCalculate = new RawTaxCalculate();
			}
			else if(item.getType().equals("manufactured")){
				taxCalculate = new ManufacturedTaxCalulate();
			}
			else if(item.getType().equals("imported")){
				taxCalculate = new ImportedTaxCalculate();
			}
			try{
				double calculatedTax = taxCalculate.calculate(item.getPrice());
				System.out.println("item name S: " +item.getName()
								 + "\nitem Price "+ item.getPrice() 
								 + "\nSales tax liability per item "+ (calculatedTax - item.getPrice())  
								 + "\nFinal price (sales tax + item price)" + calculatedTax*item.getQuantity());
			}
			catch (Exception e) {	 
				System.out.println(e);
			}
			String choice;
			System.out.println("Do you want to enter details of any other item (y/n):");
			choice = sc.next().toLowerCase();
			while(choice.length()>1 || (!choice.equals("y") && !choice.equals("n"))){
				System.out.println("bhai 'n' ya  'y' press kar -_-");
				choice = sc.next().toLowerCase();
			}
			if(choice=="n")break;
		}
			
		
	}

}
