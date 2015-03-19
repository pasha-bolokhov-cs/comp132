package main;

/**
 *
 * @author saryta
 */
type Cart struct {
	cart		[]*Item;	// an array of Items
	itemCount	int;		// total number of items in the cart
	totalPrice 	float64;	// total price of items in the cart
	capacity 	int;		// current cart capacity
}

//  Creates an empty shopping cart with a capacity of 10 items.
func NewCart() *Cart {
	c := &Cart{};
	c.capacity = 10;
	c.itemCount = 0;
	c.totalPrice = 0.0;
	c.cart = make([]*Item, 10);

	return c;
}

//  Adds an item to the shopping cart.
func (c *Cart) AddToCart(itemName string, price float64, quantity int) {
	c.cart[c.itemCount] = NewItem(itemName, price, quantity);
	c.itemCount++;
    
	c.totalPrice += price * float64(quantity);
}

//  Returns the contents of the cart together with
//  summary information.
//
//  "toString()" in Go is spelled "String()"
func (c *Cart) String() string {
	contents := "\nShopping Cart\n";
	contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

	for i := 0; i < c.itemCount; i++ {
	    contents += c.cart[i].String() + "\n";
	}

	contents += "\nTotal Price: " + CurrencyFormat(c.totalPrice);
	contents += "\n";

	return contents;
}

//  Returns the total price of the items in the cart.
func (c *Cart) GetTotal() float64 {
	return c.totalPrice;
}    
