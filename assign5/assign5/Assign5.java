
package assign5;
import media.*;



public class Assign5 {

	public static void main(String[] args) throws InterruptedException {
	
	    //		Picture pic = new Picture (FileChooser.pickAFile());
		Picture pic = new Picture ("assign5/night.jpg");
		pic.show();
		
		/*
		 * Loop through changing Red colour
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
		 * Loop through changing Green colour
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
	}
}
