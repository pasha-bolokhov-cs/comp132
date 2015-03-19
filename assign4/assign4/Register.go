package main;

import ("math"; "fmt")

type Register struct {
	 _100, _50, _20, _10, _5, _2, _1, quarters int;
	received, changeDue float64;
}

// default constructor
func NewRegister() *Register {
	return &Register{0, 0, 0, 0, 0, 0, 0, 0,
			 0.0, 0.0}
}

// a method to return the change due and calculate the 
// values within each denomination (only up to quarters). 
func (r *Register) change(amountDue float64, amountReceived float64) float64 {
	r.received = amountReceived;

	r.changeDue = amountReceived - amountDue;
	var change float64 = r.changeDue;
	r._100 = (int)(change / 100.0);
	change -= float64(r._100) * 100.0;
	
	r._50 = (int)(change / 50.0);
	change -= float64(r._50) * 50.0;
	
	r._20 = (int)(change / 20.0);
	change -= float64(r._20) * 20.0;

	r._10 = (int)(change / 10.0);
	change -= float64(r._10) * 10.0;
	
	r._5 = (int)(change / 5.0);
	change -= float64(r._5) * 5.0;
	
	r._2 = (int)(change / 2.0);
	change -= float64(r._2) * 2.0;
	
	r._1 = (int)(change);
	change -= float64(r._1);
			
	// Round the quarters up
	r.quarters = (int)(math.Ceil(change / 0.25));
	
	return r.changeDue;
}

// string representation of the object. 
func (r *Register) String() string {
	s := "Cash Register\n" + 
	     "\tReceived = " + CurrencyFormat(r.received) + "\n" +
	     "\tChange = " + CurrencyFormat(r.changeDue) + "\t\tKa-Ching!\n" +
	     "\tSplit as ";
	if (r._100 != 0) 	{ s += fmt.Sprintf("%d x $100",	r._100) }
	if (r._50 != 0)		{ s += fmt.Sprintf("  %d x $50", r._50) }
	if (r._20 != 0)		{ s += fmt.Sprintf("  %d x $20", r._20) }
	if (r._10 != 0)		{ s += fmt.Sprintf("  %d x $10", r._10) }
	if (r._5 != 0)		{ s += fmt.Sprintf("  %d x $5",	  r._5) }
	if (r._2 != 0)		{ s += fmt.Sprintf("  %d x $2",   r._2) }
	if (r._1 != 0)		{ s += fmt.Sprintf("  %d x $1",	  r._1) }
	if (r.quarters != 0) 	{ s += fmt.Sprintf("  %d quarters", r.quarters) }
	return s
}
