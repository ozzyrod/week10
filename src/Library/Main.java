/*
 * @project Week10
 * @author  Osbardo Rodriguez
 * Date:    5/1/18
 */
package Library;

/*
 * Import necessary java packages.
 */
import java.util.Scanner;

public class Main {

	public static void printMenu() {
		System.out.println( "Menu" );
		System.out.print( "Enter option: " );
	}

	/**
	 *
	 * @param args Command line arguments
	 */
    public static void main(String[] args) {

    	/*
    	 * Create a program that allows the
    	 * user to add and show books in a
    	 * library
    	 *
    	 * Every book has a title, cost, and
    	 * ISBN. In the library, we can
    	 * add books, display, and clear them out.
    	 */

    	int option;
    	int numberOfBooks = 0;
    	Book[] library = new Book[ 100 ];

    	/*
    	library[0] = new Book( "Hunger Games", 554, 19.99 );
    	library[1] = new Book();

    	numberOfBooks = 2;
    	*/

	    // Instantiate the Scanner
	    Scanner input = new Scanner( System.in );

	    do {
			printMenu();
		    option = input.nextInt();
		    input.nextLine();

		    switch ( option ) {
			    case 1:
			    	// Add book
				    System.out.print( "Title: " );
					String title = input.nextLine();
					System.out.print( "ISBN: " );
					int isbn = input.nextInt();
					System.out.print( "Cost: " );
					double cost = input.nextDouble();

					library[ numberOfBooks++ ] = new Book( title, isbn, cost );;
			    	break;
			    case 2:
			    	// Display books
				    for ( int c = 0; c < numberOfBooks; c++ ) {
				    	System.out.println( library[ c ] );
				    }
			    	break;
			    case 3:
			    	// Remove all books
			    	break;
			    case 4:
			    	System.out.println( "Bye" );
			    	break;
			    default:
			    	System.out.println( "Incorrect option" );
			    	break;
		    }
	    } while ( option != 4 );
    }
}
