//
// Calculator.go:
// 	The version of 'Calculator.java' written in Go
//
// Invocation:
// 	$ go run Calculator.go
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
     	/* create the class */
	calc := new(Calculator);

	/* call the 'main()' method */
	calc.main();
}


/*
 * The Calculator class
 */
type Calculator struct {
	/*
	 * Empty so far:
	 * All methods are defined outside
	 * of the class
	 */
}


func (calc *Calculator) main() {
	var gravity float64 = -9.81
	var initialVelocity float64 = 0.0
	var initialPosition float64 = 0.0
	var fallingTime float64 = 10.0
	var finalPosition = (1./2.) * gravity * math.Pow(fallingTime, 2) +
			    initialVelocity * fallingTime + initialPosition;

	fmt.Printf("The object's position after %g seconds is %g m.\n", fallingTime, finalPosition);
}
