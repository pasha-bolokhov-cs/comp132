
package assign5;
import media.*;



public class Assign5 {

	public static void main(String[] args) throws InterruptedException {
	
		Picture pic = new Picture (FileChooser.pickAFile());
		pic.show();
		
		/*
		 * Loop through changing Red colour component
		 */
		Thread.sleep(1000);
		pic.increaseRed();
		pic.repaint();

		Thread.sleep(1000);
		pic.changeRed(.5);
		pic.repaint();

		Thread.sleep(1000);
		pic.decreaseRed();
		pic.repaint();

		Thread.sleep(1000);
		pic.increaseRed();
		pic.repaint();

		/*
		 * Loop through changing Green colour component
		 */
		Thread.sleep(1000);
		pic.increaseGreen();
		pic.repaint();

		Thread.sleep(1000);
		pic.changeGreen(.5);
		pic.repaint();

		Thread.sleep(1000);
		pic.decreaseGreen();
		pic.repaint();

		Thread.sleep(1000);
		pic.increaseGreen();
		pic.repaint();

		/*
		 * Loop through changing Blue colour component
		 */
		Thread.sleep(1000);
		pic.increaseBlue();
		pic.repaint();

		Thread.sleep(1000);
		pic.changeBlue(.5);
		pic.repaint();

		Thread.sleep(1000);
		pic.decreaseBlue();
		pic.repaint();

		Thread.sleep(1000);
		pic.increaseBlue();
		pic.repaint();

		/*
		 * Change components by fractions a couple of times
		 */
		Thread.sleep(1000);
		pic.changeColours(0.0, -0.8, 0.3);
		pic.repaint();

		Thread.sleep(1000);
		pic.changeColours(0.4, 0.3, 0.0);
		pic.repaint();
	}
}
