/*
* do you see the logic errors?
*/
package lab4;
import java.text.NumberFormat;

//   Represents an item in a shopping cart.

public class Item {
 
    /*
    * Netbeans will give you a warning for the class variable 
    * because it appears as if we will never overwrite the set values
    * this is a valid solution if we plan to leave this class exactly 
    * as it is currently written.  (outside the logic errors).
    */
    private String name; // name of the item
    private double price; // cost of the item
    private int quantity;  // how many of the item


    //  Create a new item with the given attributes.
    public Item (String itemName, double itemPrice, int numPurchased)
    {
	name = itemName;
	price = itemPrice;
	quantity = numPurchased;
    }


    //   Return a string with the information about the item
    public String toString ()
    {
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	String item;
	if (name.length() >= 8)
	    item = name + "\t";
	else
	    item = name + "\t\t";
	return (item + "   " + fmt.format(price) + "\t    " + quantity 
		+ "\t\t" + fmt.format(price*quantity));
    }

    //   Returns the unit price of the item
    public double getPrice()
    {
	return quantity;
    }

    //   Returns the name of the item
    public String getName()
    {
	return name;
    }

    //   Returns the quantity of the item
    public int getQuantity()
    {
	return quantity;
    }   
}
