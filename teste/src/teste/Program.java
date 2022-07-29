package teste;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String name;
		int quantity=0;
		double price;
		
		System.out.println("enter the product data:");
		System.out.println("name: ");
		name=sc.next();
		System.out.println("price: ");
		price=sc.nextDouble();
		System.out.println("is there something in Stock? (y/n) ");
		char x=sc.next().charAt(0);
		if(x=='y') {
			System.out.println("how many products are in Stock? ");
			quantity=sc.nextInt();
		}
		
		Stock stock= new Stock(name, price, quantity);		
		
		System.out.println();
		System.out.println(stock);
		System.out.println();
		System.out.println("would you like to add some product in Stock? (y/n) ");
		char y=sc.next().charAt(0);
		if(y=='y') {
			System.out.println("how many products would you like to add?");
			sc.nextLine();
		quantity=sc.nextInt();
		stock.addProduct(quantity);
		System.out.println("updated: "+stock);
		}else {
			System.out.println("updated: "+stock);
		}
		System.out.println();
		System.out.println("would you like to remove some Product from the Stock? (y/n) ");
		char z=sc.next().charAt(0);
		if(z=='y'&& quantity>0) {
			System.out.println("how many products would you like to remove from the stock? ");
			quantity=sc.nextInt();
			stock.removeProducts(quantity);
			System.out.println(stock);
		}else {
			System.out.println(stock);
		}
		
		sc.close();
	}

}
