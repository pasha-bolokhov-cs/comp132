package assign2;

public class CashRegister {

	/**
	 * Prints the amount of change returned split into bills and coins
	 *
	 * @param due	Amount due
	 * @param paid	Amount actually paid
	 */
	public void returnChange(double due, double paid) {
		double change = paid - due;
		
		int hundreds = (int)(change / 100.0);
		change -= hundreds * 100.0;
		
		int fifties = (int)(change / 50.0);
		change -= fifties * 50.0;
		
		int twenties = (int)(change / 20.0);
		change -= twenties * 20.0;
		
		int tens = (int)(change / 10.0);
		change -= tens * 10.0;
		
		int fives = (int)(change / 5.0);
		change -= fives * 5.0;
		
		int twoonies = (int)(change / 2.0);
		change -= twoonies * 2.0;
		
		int loonies = (int)change;
		change -= loonies;
				
		// Round the quarters up
		int quarters = (int)Math.ceil(change / 0.25);
				
		// Now print out
		System.out.println("$100:\t" + hundreds);
		System.out.println("$50:\t" + fifties);
		System.out.println("$20:\t" + twenties);
		System.out.println("$10:\t" + tens);
		System.out.println("$5:\t" + fives);
		System.out.println("$2:\t" + twoonies);
		System.out.println("$1:\t" + loonies);
		System.out.println("25c:\t" + quarters);
	}
}
