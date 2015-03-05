package assign6;

import media.*;



public class Assign6 {

	public static void main(String[] args) throws InterruptedException {
	
		Picture pic = new Picture ("assign6/night.jpg");
		Picture spare = new Picture(pic);			// save the picture
		pic.show();
		pic.runEffect();
		pic.repaint();

		while (true) {
			Thread.sleep(800);
			Picture other = new Picture(spare);
			other.rotateThisImage(30.0);
			other.repaint();
		}
	}
}
