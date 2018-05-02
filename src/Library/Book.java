/*
 * @project Week10
 * @author  Osbardo Rodriguez
 * Date:    5/1/18
 */
package Library;

public class Book {
	private String title;
	private int isbn;
	private double cost;

	public Book() {
		title = "";
		isbn = -1;
		cost = 0.0;
	}

	/**
	 * Book constructor.
	 *
	 * @param t
	 * @param i
	 * @param c
	 */
	public Book( String t, int i, double c ) {
		title = t;
		isbn = i;
		cost = c;
	}

	/**
	 * Sets the title.
	 *
	 * @param String t The title of the book.
	 */
	public void setTitle( String t ) {
		title = t;
	}

	/**
	 * Set the ISBN.
	 *
	 * @param int i The ISBN of the book
	 */
	public void setIsbn( int i ) {
		isbn = i;
	}

	/**
	 * Sets the cost of the book.
	 *
	 * @param double c The cost of the book
	 */
	public void setCost( double c ) {
		cost = c;
	}

	/**
	 * Returns the title
	 *
	 * @return String title The title of the book.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Returns the ISBN of the book.
	 *
	 * @return int isbn The ISBN of the book.
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * Returns the cost of the book.
	 *
	 * @return double cost The cost of the book.
	 */
	public double getCost() {
		return cost;
	}

	/**
	 *
	 * @return
	 */
	public String toString() {
		return String.format( "%s: %d costs $%.2f", title, isbn, cost );
	}
}
