package assign7;

import media.*;



public class Assign7 {

	public static void main(String[] args)
	{
		Picture pic = new Picture ("images/background.jpg");
		pic.show();

		Picture[] pList = {
			new Picture("images/flower1.jpg"),
			new Picture("images/flower2.jpg"),
			new Picture("images/flower3.jpg"),
			new Picture("images/flower4.jpg"),
			new Picture("images/flower5.jpg"),
			new Picture("images/flower6.jpg")
		};
		pic.makeCollage(pList);
		pic.repaint();
	}

}
