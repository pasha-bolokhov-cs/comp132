
package assign5;
import media.*;



public class Assign5 {

    public static void main(String[] args) {

        Picture pic = new Picture (FileChooser.pickAFile());
        pic.show();

        pic.increaseRed();
        pic.changeRed(.5);
        pic.decreaseRed();
        pic.repaint();


    }
}
