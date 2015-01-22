//
// Assign2.go:
// 	The version of 'Assign2.java' written in Go
//
// Invocation:
// 	$ go run Assign2.go
//
// Needs:
// 	'golang' package installed
//

package main;


import (
	"fmt"
	"math"
	"os"
);


/*
 * This is the program entry function
 */
func main() {
	//
	// Part 1 - Spheres
	//
	s := NewSphere(15);
	t := NewSphere(8);

	// Display geometric information about Sphere 1
	fmt.Println("Sphere 1:");
	fmt.Println("\tradius ", s.r);
	fmt.Println("\tsurface area ", s.getArea());
	fmt.Println("\tvolume ", s.getVolume());

	// Make some interval
	fmt.Print("\n");
	
	// Display geometric information about Sphere 2
	fmt.Println("Sphere 2:");
	fmt.Println("\tradius ", t.r);
	fmt.Println("\tsurface area ", t.getArea());
	fmt.Println("\tvolume ", t.getVolume());
	
	// Make another interval
	fmt.Print("\n");

	// Print the ratios
	fmt.Println("Their area ratio: ", (float64)(s.getArea() / t.getArea()));
	fmt.Println("Their volume ratio: ", (float64)(s.getVolume() / t.getVolume()));
	fmt.Println("\n\n");


	//
	// Part 2 - Cash Register
	//
	var due, paid float64
	cash := &CashRegister{};	// This is instead of
					// calling "new CashRegister()"
	fmt.Print("Amount due: ");
	fmt.Scanf("%g", &due);
	fmt.Print("Amount paid: ");
	fmt.Scanf("%g", &paid);

	if (paid < due) {
		fmt.Fprintf(os.Stderr, "Did not pay enough! (%g < %g)\n", paid, due);
		return;
	}
	cash.returnChange(due, paid);
}


/*
 * Sphere class
 *
 * In Go all "methods" are outside
 */
type Sphere struct {
	r int;
}

/*
 * Go does not support explicit constructors
 * Trivial initializing constructors are not needed in Go, watch this:
 *     sphere := &Sphere{ 10 };
 *
 * We still define a "constructor", in case we wanted
 * to do something non-trivial later
 */
func NewSphere(radius int) *Sphere {
     return &Sphere{ radius }
}

/*
 * 's' is instead of 'this'
 */
func (s *Sphere) getArea() float32 {
	// Numeric type conversions have to be explicit
	return (float32)(4.0 * math.Pi * float32(s.r) * float32(s.r));
}

func (s *Sphere) getVolume() float32 {
	// Numeric type conversions have to be explicit
	return (float32)(4.0 * math.Pi * float32(s.r) * float32(s.r) * float32(s.r) / 3.0);
}


/*
 * CashRegister class
 */
type CashRegister struct {
	// Nothing to declare here
}

func (c *CashRegister) returnChange(due float64, paid float64) {
	change := paid - due;
	
	hundreds := int(change / 100.0);
	change -= float64(hundreds) * 100.0;
	
	fifties := int(change / 50.0);
	change -= float64(fifties) * 50.0;
	
	twenties := int(change / 20.0);
	change -= float64(twenties) * 20.0;
	
	tens := int(change / 10.0);
	change -= float64(tens) * 10.0;
	
	fives := int(change / 5.0);
	change -= float64(fives) * 5.0;
	
	twoonies := int(change / 2.0);
	change -= float64(twoonies) * 2.0;
	
	loonies := int(change);
	change -= float64(loonies);
			
	// Round the quarters up
	quarters := int(math.Ceil(change / 0.25));
			
	// Now print out
	fmt.Println("$100:\t", hundreds);
	fmt.Println("$50:\t", fifties);
	fmt.Println("$20:\t", twenties);
	fmt.Println("$10:\t", tens);
	fmt.Println("$5:\t", fives);
	fmt.Println("$2:\t", twoonies);
	fmt.Println("$1:\t", loonies);
	fmt.Println("25c:\t", quarters);
}