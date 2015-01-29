package lab3b;

/**
 * @author: Book.java
 */
public class Book {

    /**
     * global variable to store the title of the book
     */
    private String title;

    /**
     * global variable to store the author of the book
     */
    private String author;

    /**
     * global variable to store the number of pages in a book
     */
    private int pages;

    /**
     * global variable to store the price of the book
     */
    private double price;

    /**
     * global variable to store the total number of books
     */
    private static int bookNum = 0;

    /**
     * global variable to store the ordinal number of this book
     */
    private int currentNum;


    /**
     * The constructor which sets default values
     *
     * @param none
     */
    public Book() {
	title = "Princess Academy";
	author = "Shannon Hale";
	pages = 215;
	price = 18.50;

	currentNum = ++bookNum;
    }

    /**
     * The constructor which sets the title and the author
     *
     * @param	aTitle		The title of the book
     * @param	anAuthor	The author of the book
     */
    public Book(String aTitle, String anAuthor) {
	title = aTitle;
	author = anAuthor;

	currentNum = ++bookNum;
    }

    /**
     * Display some information about a particular book
     *
     * @param none
     * @return the output string
     */
    public String toString() {
        return null;
    }

    /**
     * Get the number of books created so far
     *
     * @param none
     * @return the number of books
     */
    public int getBookNum() {
	return bookNum;
    }

    /**
     * Get the title
     *
     * @param	none
     * @return	the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * Set the new title
     *
     * @param	aTitle		The new title
     */
    public void setTitle(String aTitle) {
	title = aTitle;
    }

    /**
     * Get the author
     *
     * @param	none
     * @return	the author
     */
    public String getAuthor() {
	return author;
    }

    /**
     * Set the author
     *
     * @param	anAuthor	The new author
     */
    public void setAuthor(String anAuthor) {
	author = anAuthor;
    }

    /**
     * Get the number of pages
     *
     * @param	none
     * @return	the number of pages
     */
    public int getPages() {
	return pages;
    }

    /**
     * Set the number of pages
     *
     * @param	numPages	New number of pages
     */
    public void setPages(int numPages) {
	pages = numPages;
    }

    /**
     * Get the price
     * 
     * @param	none
     * @return	the price
     */
    public double getPrice() {
	return price;
    }

    /**
     * Set the price
     *
     * @param	aPrice		New price
     */
    public void setPrice(double aPrice) {
	price = aPrice;
    }

    /**
     * Get this book's number
     */
}
