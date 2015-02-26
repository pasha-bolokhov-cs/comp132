
package assign5;
import media.*;



public class Assign5 {

	public static void main(String[] args) throws InterruptedException {
	
		Picture pic = new Picture (FileChooser.pickAFile());
		pic.show();
		
		pic.increaseRed();
		pic.repaint();

		Thread.sleep(500);
		pic.changeRed(.5);
		pic.repaint();

		Thread.sleep(500);
		pic.decreaseRed();
		pic.repaint();
	}
}
