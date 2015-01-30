//
// Book class
//

package main;

//
// Go privacy model is as follows:
//     identifiers beginning with a small letter are not exported
//     identifiers beginning with a capital letter are exported
//


import (
	"fmt"
	"strconv"
)

/**
 * global variable to store the total number of books
 */
var bookNum int = 0;	// Since we work class per file
    	    	  	// the variable does not have to be
			// in the class

/**
 * @author: 
 */
type Book struct {
	/**
	 * global variable to store the title of the book
	 */
	title string

	/**
	 * global variable to store the author of the book
	 */
	author string

	/**
	 * global variable to store the number of pages in a book
	 */
	pages int

	/**
	 * global variable to store the price of the book
	 */
	price float64

	/**
	 * global variable to store the ordinal number of this book
	 */
	currentNum int
}


/**
 * The constructor which sets default values
 *
 * @param none
 */
func NewBook() *Book {
	var b *Book = &Book {}		// fields default to "nil"
	bookNum++
	b.currentNum = bookNum
	return b
}

/**
 * The constructor which sets the title and the author
 * Go **intentionally** does not provide method/function overloading
 *
 * @param	aTitle		The title of the book
 * @param	anAuthor	The author of the book
 */
func NewBook_TitleAuthor(aTitle string, anAuthor string) *Book {
	bookNum++
	var b *Book = &Book {aTitle, anAuthor, 0, 0.0, bookNum}	// fields default to "nil"
	return b
}

/**
 * Display some information about a particular book
 *
 * @param none
 * @return the output string
 */
func (b *Book) toString() string {
    return strconv.Itoa(b.GetIndex()) + ":\tTitle:\t" + b.title + 
	    "\tauthor:\t" + b.author + "\tpages:\t" + strconv.Itoa(b.pages) +
	    "\tprice:\t$" + fmt.Sprintf("%g", b.price);
}

/**
 * Get the number of books created so far
 *
 * @param none
 * @return the number of books
 */
func (b *Book) GetBookNum() int {
	return bookNum;
}

/**
 * Get the title
 *
 * @param	none
 * @return	the title
 */
func (b *Book) GetTitle() string {
	return b.title;
}

/**
 * Set the new title
 *
 * @param	aTitle		The new title
 */
func (b *Book) SetTitle(aTitle string) {
	b.title = aTitle;
}

/**
 * Get the author
 *
 * @param	none
 * @return	the author
 */
func (b *Book) GetAuthor() string {
	return b.author;
}

/**
 * Set the author
 *
 * @param	anAuthor	The new author
 */
func (b *Book) SetAuthor(anAuthor string) {
	b.author = anAuthor;
}

/**
 * Get the number of pages
 *
 * @param	none
 * @return	the number of pages
 */
func (b *Book) GetPages() int {
	return b.pages;
}

/**
 * Set the number of pages
 *
 * @param	numPages	New number of pages
 */
func (b *Book) SetPages(numPages int) {
	b.pages = numPages;
}

/**
 * Get the price
 * 
 * @param	none
 * @return	the price
 */
func (b *Book) GetPrice() float64 {
	return b.price;
}

/**
 * Set the price
 *
 * @param	aPrice		New price
 */
func (b *Book) SetPrice(aPrice float64) {
	b.price = aPrice;
}

/**
 * Get this book's number
 *
 * @param	none
 * @return	this book's number
 */
func (b *Book) GetIndex() int {
	return b.currentNum;
}
