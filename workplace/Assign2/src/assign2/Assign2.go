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
