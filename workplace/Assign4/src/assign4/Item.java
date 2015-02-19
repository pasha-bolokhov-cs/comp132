package assign4;
import java.text.NumberFormat;

//   Represents an item in a shopping cart.
public class Item {

	private String name;	// name of the item
	private double price;	// cost of the item
	private int quantity;	// how many of the item
	
	//  Create a new item with the given attributes.
	public Item (String itemName, double itemPrice, int numPurchased) {
		name = itemName;
		price = itemPrice;
		quantity = numPurchased;
	}
	
	//   Return a string with the information about the item
	public String toString () {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String item;

		item = name + (name.length() >= 8 ? "\t" : "\t\t");
		return (item + "   " + fmt.format(price) + "\t    " + quantity 
			+ "\t\t" + fmt.format(price * quantity));
	}
	
	//   Returns the unit price of the item
	public double getPrice() {
		return price;
	}
	
	//   Returns the name of the item
	public String getName() {
		return name;
	}
	
	//   Returns the quantity of the item
	public int getQuantity() {
		return quantity;
	}   
}
