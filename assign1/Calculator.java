//
// The output of the unmodified program:
// "The object's position after 10.0 seconds is 0.0m."
// No wonder!

public class Calculator {

	/**
	 * @param args Command Line Arguments
	 */
	public static void main(String[] args) {
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double initialPosition = 0.0;
		double fallingTime = 10.0;
		double finalPosition = (1./2.) * gravity * Math.pow(fallingTime, 2) +
				initialVelocity * fallingTime + initialPosition;
		System.out.println("The object's position after " + fallingTime + " seconds is " +
				finalPosition + "m.");
	}
}
