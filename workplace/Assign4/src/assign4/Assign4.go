package main;

import "fmt"

/**
 * @param args the command line arguments
 */
func main() {
	var itemName string;
	var quantity int;
	var price float64;

	cart := NewCart();
	
	fmt.Println("Welcome to Shopper's Paradise");
	fmt.Println();
	
	fmt.Print("Enter the name of the first item: ");
	fmt.Scanf("%s", &itemName);
	for (itemName != "q") && (itemName != "Q") {
		fmt.Print("Enter the quantity: ");
		fmt.Scanf("%d", &quantity);
		fmt.Print("Enter the price: ");
		fmt.Scanf("%g", &price);
	
		cart.AddToCart(itemName, price, quantity);
	
		fmt.Print("Enter the name of the next item or Q to quit: ");
		fmt.Scanf("%s", &itemName);
	}
	
	fmt.Println();
	fmt.Println(cart);
	fmt.Println();
	
	fmt.Println("Please pay... " + CurrencyFormat(cart.GetTotal()));

	fmt.Print("How much are you giving me? ");
	var amountReceived float64 
	fmt.Scanf("%g", &amountReceived)
	r := NewRegister();
	fmt.Println("Your change is: " + CurrencyFormat(r.change(cart.GetTotal(), amountReceived)));
	fmt.Println(r.String());
}
