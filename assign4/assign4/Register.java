package assign4;
import java.text.NumberFormat;

public class Register {
	private int _100, _50, _20, _10, _5, _2, _1, quarters;
	private double received, changeDue;
	
	// default constructor
	public Register() {
		_100 = _50 = _20 = _10 = _5 = _2 = _1 = quarters = 0;
		received = changeDue = 0.0;
	}
	
	// a method to return the change due and calculate the 
	// values within each denomination (only up to quarters). 
	public double change(double amountDue, double amountReceived) {
		received = amountReceived;

		double change = changeDue = amountReceived - amountDue;
		_100 = (int)(change / 100.0);
                change %= 100.0;
                
                _50 = (int)(change / 50.0);
                change %= 50.0;
                
                _20 = (int)(change / 20.0);
                change %= 20.0;

                _10 = (int)(change / 10.0);
                change %= 10.0;
                
                _5 = (int)(change / 5.0);
                change %= 5.0;
                
                _2 = (int)(change / 2.0);
                change %= 2.0;
                
                _1 = (int)change;
                change -= _1;
                                
                // Round the quarters up
                quarters = (int)Math.ceil(change / 0.25);
		
	    	return changeDue;
	}
	
	// string representation of the object. 
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();

		return "Cash Register\n" + 
		       "\tReceived = " + fmt.format(received) + "\n" +
		       "\tChange = " + fmt.format(changeDue) + "\t\tKa-Ching!\n" +
		       "\tSplit as " +
		       (_100 != 0 ? String.format("%d x $100",	_100) : "") + 
		       ( _50 != 0 ? String.format("  %d x $50",	 _50) : "") + 
		       ( _20 != 0 ? String.format("  %d x $20",	 _20) : "") + 
		       ( _10 != 0 ? String.format("  %d x $10",	 _10) : "") + 
		       (  _5 != 0 ? String.format("  %d x $5",	  _5) : "") + 
		       (  _2 != 0 ? String.format("  %d x $2",	  _2) : "") + 
		       (  _1 != 0 ? String.format("  %d x $1",	  _1) : "") + 
		       (quarters != 0 ? String.format("  %d quarters", quarters) : "");
	}
}
