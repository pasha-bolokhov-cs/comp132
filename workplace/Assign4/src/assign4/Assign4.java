package assign4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author saryta
 */
public class Assign4 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		String itemName;
		int quantity;
		double price;
		Scanner scan = new Scanner(System.in);
		
		Cart cart = new Cart();
		
		System.out.println("Welcome to Shopper's Paradise");
		System.out.println();
		
		System.out.print("Enter the name of the first item: ");
		itemName = scan.nextLine();
		while (!itemName.equals("q") && !itemName.equals("Q")) {
			System.out.print("Enter the quantity: ");
			quantity = scan.nextInt();
			System.out.print("Enter the price: ");
			price = scan.nextDouble();
			scan.nextLine();    // read over to the end of line
		
			cart.addToCart(itemName, price, quantity);
		
			System.out.print("Enter the name of the next item or Q to quit: ");
			itemName = scan.nextLine();
		}
		
		System.out.println();
		System.out.println(cart);
		System.out.println();
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println ("Please pay... " + fmt.format(cart.getTotal()));

		System.out.print("How much are you giving me? ");
		double amountReceived = scan.nextDouble();
		Register r = new Register();
		System.out.println("Your change is: " + fmt.format(r.change(cart.getTotal(), amountReceived)));
		System.out.println(r.toString());
	}
}
