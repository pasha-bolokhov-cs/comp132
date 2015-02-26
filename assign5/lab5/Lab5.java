
package lab5;
import media.*;



public class Lab5 {

    public static void main(String[] args) {

        Picture pic = new Picture (FileChooser.pickAFile());
        pic.show();

        pic.increaseRed();
        pic.changeRed(.5);
        pic.decreaseRed();
        pic.repaint();


    }
}
