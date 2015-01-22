package assign2;

import java.util.Scanner;

public class Assign2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//
		// Part 1 - Spheres
		//
		Sphere s = new Sphere(15);
		Sphere t = new Sphere(8);

		// Display geometric information about Sphere 1
		System.out.println("Sphere 1:");
		System.out.println("\tradius " + s.r);
		System.out.println("\tsurface area " + s.getArea());
		System.out.println("\tvolume " + s.getVolume());
	
		// Make some interval
		System.out.print("\n");
		
		// Display geometric information about Sphere 2
		System.out.println("Sphere 2:");
		System.out.println("\tradius " + t.r);
		System.out.println("\tsurface area " + t.getArea());
		System.out.println("\tvolume " + t.getVolume());
		
		// Make another interval
		System.out.print("\n");
		System.out.println("Their area ratio: " + (double)(s.getArea() / t.getArea()));
		System.out.println("Their volume ratio: " + (double)(s.getVolume() / t.getVolume()));
		System.out.println("\n\n");
		
		//
		// Part 2 - Cash Register
		//
		Scanner sc = new Scanner(System.in);
		CashRegister cash = new CashRegister();
		System.out.print("Amount due: ");
		double due = sc.nextDouble();
		System.out.print("Amount paid: ");
		double paid = sc.nextDouble();
		
		if (paid < due) {
			System.err.printf("Did not pay enough! (%g < %g)\n", paid, due);
			return;
		}
		cash.returnChange(due, paid);
	}

}
