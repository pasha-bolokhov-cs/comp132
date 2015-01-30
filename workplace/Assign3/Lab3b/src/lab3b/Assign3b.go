package main;

import (
	"fmt"
)

func main() {
	book1 := NewBook();
	book2 := NewBook_TitleAuthor("Learning Php, MySQL and JavaScript", "Nixon");

	book1.SetTitle("The Shining");
	book1.SetPages(450);
	book1.SetAuthor("George");

	book1.SetPages(256);
	book2.SetPages(1024);

	book1.SetPrice(256.25);
	book2.SetPrice(52.23);

	/**
	 * print out the books information
	 */
	fmt.Printf("Total Number of books: %d\n", book2.GetBookNum());

	fmt.Println("Book " + book1.toString());

	fmt.Println("Book " + book2.toString());

	fmt.Println();
}

/* sample output:
     Total Number of books: 2
     Book 1: Title: The Shining   author: George   pages: 256   price: $256.25
     Book 2: Title: learning Php, MySQL and JavaScript   author: Nixon   pages: 1024   price: $52.23
*/
