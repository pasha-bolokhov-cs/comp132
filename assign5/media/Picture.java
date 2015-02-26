package media;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.text.*;

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 *
 * Copyright Georgia Institute of Technology 2004-2005
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////
	
	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/* not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor 
		 */
		super();
	}
	
	/**
	 * Constructor that takes a file name and creates the picture
	 *
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}
	
	/**
	 * Constructor that takes the width and height
	 *
	 * @param width the width of the desired picture
	 * @param height the height of the desired picture
	 */
	public Picture(int width, int height) {
		// let the parent class handle this width and height
		super(width, height);
	}
	
	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}
	
	////////////////////// methods ///////////////////////////////////////
	/**
	 * Method to return a string with information about this picture.
	 *
	 * @return a string with information about the picture such as fileName,
	 * height and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName()
						     + " height " + getHeight()
						     + " width " + getWidth();
		return output;
	}
	
	/**
	 * Method decreases the amount of red in every pixel of this image by half.
	 */
	public void decreaseRed() {
		Pixel[] pixelArray = this.getPixels();
		int value = 0;
	
		// loop through all the pixels in the array
		for (Pixel pixelObj : pixelArray) {
			// get the red value of the current pixel
			value = pixelObj.getRed();
			// decrease the red value by 50%
			value = value / 2;
			// set the red value of the current pixel to the new value
			pixelObj.setRed(value);
		}
	}
	
	/**
	 * Method increases the amount of red in every pixel of this image by half.
	 */
	public void increaseRed() {
		Pixel[] pixelArray = this.getPixels();
		int value = 0;
	
		// loop through all the pixels in the array
		for (Pixel pixelObj : pixelArray) {
			// get the red value of the current pixel
			value = pixelObj.getRed();
			// increase the red value by 50%
			value = value * 2;
			// set the red value of the current pixel to the new value
			pixelObj.setRed(value);
		}
	}
	
	/**
	 * Method changes the amount of red in every pixel by a percentage
	 *
	 * @param percentage The percentage by which to decrease the red, expressed
	 * as a number from 0-1.
	 */
	public void changeRed(double percentage) {
		Pixel[] pixelArray = this.getPixels();
		int value = 0;
	
		// loop through all the pixels in the array
		for (Pixel pixelObj : pixelArray) {
			// get the red value of the current pixel
			value = pixelObj.getRed();
			// ****** decrease the red value by 30% ********
			value = (int) (value * percentage);
			// set the red value of the current pixel
			pixelObj.setRed(value);
		}
	}


	/**
	 * Method decreases the amount of green in every pixel of this image by half.
	 */
	public void decreaseGreen() {
		int x, y;

		// loop through all the pixels in the array
		x = 0;
		while (x < this.getWidth()) {
			y = 0;
			while (y < this.getHeight()) {
				Pixel p = this.getPixel(x, y);
				p.setGreen(p.getGreen() / 2);
				y++;
			}
			x++;
		}
	}
	
	/**
	 * Method increases the amount of green in every pixel of this image by half.
	 */
	public void increaseGreen() {
		int x, y;

		// loop through all the pixels in the array
		x = 0;
		while (x < this.getWidth()) {
			y = 0;
			while (y < this.getHeight()) {
				Pixel p = this.getPixel(x, y);
				p.setGreen(p.getGreen() * 2);
				y++;
			}
			x++;
		}
	}
	
	/**
	 * Method changes the amount of green in every pixel by a percentage
	 *
	 * @param percentage The percentage by which to decrease the blue, expressed
	 * as a number from 0-1.
	 */
	public void changeGreen(double percentage) {
		int x, y;

		// loop through all the pixels in the array
		x = 0;
		while (x < this.getWidth()) {
			y = 0;
			while (y < this.getHeight()) {
				Pixel p = this.getPixel(x, y);
				p.setGreen((int)(p.getGreen() * percentage));
				y++;
			}
			x++;
		}
	}


	/**
	 * Method decreases the amount of blue in every pixel of this image by half.
	 */
	public void decreaseBlue() {
		// loop through all the pixels in the array
		for (int x = 0; x < this.getWidth(); x++) {
			for (int y = 0; y < this.getHeight(); y++) {
				Pixel p = this.getPixel(x, y);
				p.setBlue(p.getBlue() / 2);
			}
		}
	}
	
	/**
	 * Method increases the amount of blue in every pixel of this image by half.
	 */
	public void increaseBlue() {
		// loop through all the pixels in the array
		for (int x = 0; x < this.getWidth(); x++) {
			for (int y = 0; y < this.getHeight(); y++) {
				Pixel p = this.getPixel(x, y);
				p.setBlue(p.getBlue() * 2);
			}
		}
	}
	
	/**
	 * Method changes the amount of blue in every pixel by a percentage
	 *
	 * @param percentage The percentage by which to decrease the blue, expressed
	 * as a number from 0-1.
	 */
	public void changeBlue(double percentage) {
		// loop through all the pixels in the array
		for (int x = 0; x < this.getWidth(); x++) {
			for (int y = 0; y < this.getHeight(); y++) {
				Pixel p = this.getPixel(x, y);
				p.setBlue((int)(p.getBlue() * percentage));
			}
		}
	}


	/**
	 * Method changes the components by fractions
	 *
	 * @param r	percentage to change the red component
	 * @param g	percentage to change the green component
	 * @param b	percentage to change the blue component
	 */
	public void changeColours(double r, double g, double b) {
		Pixel[] pixels = this.getPixels();
		for (Pixel p: pixels) {
			p.setRed((int)(p.getRed() * (1.0 + r)));
			p.setGreen((int)(p.getGreen() * (1.0 + g)));
			p.setBlue((int)(p.getBlue() * (1.0 + b)));
		}
	}
} // end of class Picture, put all new methods before this

