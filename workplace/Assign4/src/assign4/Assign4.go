package assign4;

import "fmt";

/**
 * @param args the command line arguments
 */
func main() {
	itemName string;
	quantity int;
	price float64;

//	Cart cart = new Cart();
	
	fmt.Println("Welcome to Shopper's Paradise");
	System.out.println();
	
	System.out.print("Enter the name of the first item: ");
	itemName = scan.nextLine();
	while (!itemName.equals("q") && !itemName.equals("Q")) {
		System.out.print ("Enter the quantity: ");
		quantity = scan.nextInt();
		System.out.print ("Enter the price: ");
		price = scan.nextDouble();
		scan.nextLine();    // read over to the end of line
	
		cart.addToCart(itemName, price, quantity);
	
		System.out.print ("Enter the name of the next item or Q to quit: ");
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
	System.out.println(r.ToString());
}
