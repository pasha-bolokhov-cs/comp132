package assign4;

import ("fmt", "strconv")

//   Represents an item in a shopping cart.
type Item struct {

	name string;	// name of the item
	price float64;	// cost of the item
	quantity int;	// how many of the item
}
	
	//  Create a new item with the given attributes.
func (I *Item) Item (itemName string, itemPrice float64, numPurchased int) {
		I.name = itemName;
		I.price = itemPrice;
		I.quantity = numPurchased;
}
	
//   Return a string with the information about the item
func (I *Item) ToString () string
{
	string item;

	item = name + (name.length() >= 8 ? "\t" : "\t\t");
	return (item + "   " + FormatFloat(price) 'f', -1, 64) + "\t    " + quantity 
		+ "\t\t" + fmt.format(price * quantity));
}

//   Returns the unit price of the item
float64 GetPrice()
{
	return price;
}

//   Returns the name of the item
string GetName()
{
	return name;
}

//   Returns the quantity of the item
int GetQuantity()
{
	return quantity;
}   

