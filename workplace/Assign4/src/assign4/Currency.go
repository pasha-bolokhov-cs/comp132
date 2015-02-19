
package main;

import "fmt"
import "math"

/*
 * Assume quadrillion values at most.
 * If the supplied number is greater than a quintillion
 * we return "$<brazillions>"
 */
func CurrencyFormat(num float64) string {
	var s string = "";

	if (math.Abs(num) >= 1.0e+18) {
		return "$<brazillions>"
	}

	if (num < 0) {
		s += "-";
		num = -num;
	}
	s += "$"

	quad := int(num / 1.0e+15);	num -= 1.0e+15 * float64(quad);
	tril := int(num / 1.0e+12);	num -= 1.0e+12 * float64(tril);
	bill := int(num / 1.0e+09);	num -= 1.0e+09 * float64(bill);
	mill := int(num / 1.0e+06);	num -= 1.0e+06 * float64(mill);
	thou := int(num / 1.0e+03);	num -= 1.0e+03 * float64(thou);
	unit := int(num);		num -= 		 float64(unit);
	cent := int(math.Floor(num * 100 + 0.5))	// Go doesn't have "round()" yet

	if (quad != 0) {
		s += fmt.Sprintf("%d", quad) + ","
		s += fmt.Sprintf("%03d", tril) + ","
		s += fmt.Sprintf("%03d", bill) + ","
		s += fmt.Sprintf("%03d", mill) + ","
		s += fmt.Sprintf("%03d", thou) + ","
		s += fmt.Sprintf("%03d", unit) + "."
		s += fmt.Sprintf("%02d", cent)
		return s;
	}

	if (tril != 0) {
		s += fmt.Sprintf("%d", tril) + ","
		s += fmt.Sprintf("%03d", bill) + ","
		s += fmt.Sprintf("%03d", mill) + ","
		s += fmt.Sprintf("%03d", thou) + ","
		s += fmt.Sprintf("%03d", unit) + "."
		s += fmt.Sprintf("%02d", cent)
		return s;
	}

	if (bill != 0) {
		s += fmt.Sprintf("%d", bill) + ","
		s += fmt.Sprintf("%03d", mill) + ","
		s += fmt.Sprintf("%03d", thou) + ","
		s += fmt.Sprintf("%03d", unit) + "."
		s += fmt.Sprintf("%02d", cent)
		return s;
	}

	if (mill != 0) {
		s += fmt.Sprintf("%d", mill) + ","
		s += fmt.Sprintf("%03d", thou) + ","
		s += fmt.Sprintf("%03d", unit) + "."
		s += fmt.Sprintf("%02d", cent)
		return s;
	}

	if (thou != 0) {
		s += fmt.Sprintf("%d", thou) + ","
		s += fmt.Sprintf("%03d", unit) + "."
		s += fmt.Sprintf("%02d", cent)
		return s;
	}

	if (unit != 0) {
		s += fmt.Sprintf("%d", unit) + "."
	} else {
		s += "0."
	}
	s += fmt.Sprintf("%02d", cent)
	return s
}


func main() {

	for {
		var num float64

		fmt.Printf("Enter a number: ")
		fmt.Scanf("%g", &num)
		fmt.Printf("The currency format is: " + CurrencyFormat(num) + "\n")
	}
}
