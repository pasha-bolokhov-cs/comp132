package main;

import "fmt"

//   Represents an item in a shopping cart.
type Item struct {
	name string;	// name of the item
	price float64;	// cost of the item
	quantity int;	// how many of the item
}
	
	//  Create a new item with the given attributes.
func NewItem (itemName string, itemPrice float64, numPurchased int) *Item {
	return &Item{itemName, itemPrice, numPurchased}
}
	
//   Return a string with the information about the item
func (I *Item) String () string {
	var item string;

	item = I.name + "\t"
	if (len(I.name) >= 8) {
		item += "\t" 
	} 
	return item + "   " + CurrencyFormat(I.price) + "\t    " + fmt.Sprintf("%d", I.quantity) +
		"\t\t" + CurrencyFormat(I.price * float64(I.quantity));
}

//   Returns the unit price of the item
func (I *Item) GetPrice() float64 {
	return I.price;
}

//   Returns the name of the item
func (I *Item) GetName() string {
	return I.name;
}

//   Returns the quantity of the item
func (I *Item) GetQuantity() int {
	return I.quantity;
}   
