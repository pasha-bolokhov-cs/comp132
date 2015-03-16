package assign7;

import media.*;



public class Assign7 {

	public static void main(String[] args) throws InterruptedException {
	
		Picture pic = new Picture (FileChooser.pickAFile());
		Picture spare = new Picture(pic);			// save the picture
		pic.show();
		Thread.sleep(800);
		pic.runEffect();					// run the effect
		pic.repaint();
		Thread.sleep(800);

		double angle = 0.0;
		while (true) {
			Thread.sleep(1200);
			pic.hide();
			pic = null;					// delete the picture
			pic = new Picture(spare);			// take the original picture
			pic.rotateThisImage(angle += 30.0);
			pic.repaint();
		}
	}

}
