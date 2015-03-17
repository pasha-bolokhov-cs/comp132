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
	public Picture()
	{
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
	public Picture(String fileName)
	{
		// let the parent class handle this fileName
		super(fileName);
	}
	
	/**
	 * Constructor that takes the width and height
	 *
	 * @param width the width of the desired picture
	 * @param height the height of the desired picture
	 */
	public Picture(int width, int height)
	{
		// let the parent class handle this width and height
		super(width, height);
	}
	
	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 */
	public Picture(Picture copyPicture)
	{
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
	public String toString()
	{
		String output = "Picture, filename " + getFileName()
						     + " height " + getHeight()
						     + " width " + getWidth();
		return output;
	}
	
	/**
	 * Method decreases the amount of red in every pixel of this image by half.
	 */
	public void decreaseRed()
	{
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
	public void increaseRed()
	{
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
	public void changeRed(double percentage)
	{
		Pixel[] pixelArray = this.getPixels();
		int value = 0;
	
		// loop through all the pixels in the array
		for (Pixel pixelObj : pixelArray) {
			// get the red value of the current pixel
			value = pixelObj.getRed();
			// ****** decrease the red value by 30% ********
			value = (int) (value * (1.0 + percentage));
			// set the red value of the current pixel
			pixelObj.setRed(value);
		}
	}


	/**
	 * Method decreases the amount of green in every pixel of this image by half.
	 */
	public void decreaseGreen()
	{
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
	public void increaseGreen()
	{
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
	public void changeGreen(double percentage)
	{
		int x, y;

		// loop through all the pixels in the array
		x = 0;
		while (x < this.getWidth()) {
			y = 0;
			while (y < this.getHeight()) {
				Pixel p = this.getPixel(x, y);
				p.setGreen((int)(p.getGreen() * (1.0 + percentage)));
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
	public void increaseBlue()
	{
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
	public void changeBlue(double percentage)
	{
		// loop through all the pixels in the array
		for (int x = 0; x < this.getWidth(); x++) {
			for (int y = 0; y < this.getHeight(); y++) {
				Pixel p = this.getPixel(x, y);
				p.setBlue((int)(p.getBlue() * (1.0 + percentage)));
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
	public void changeColours(double r, double g, double b)
	{
		Pixel[] pixels = this.getPixels();
		for (Pixel p: pixels) {
			p.setRed((int)(p.getRed() * (1.0 + r)));
			p.setGreen((int)(p.getGreen() * (1.0 + g)));
			p.setBlue((int)(p.getBlue() * (1.0 + b)));
		}
	}

	/**
	 * Method to rotate this image 'd' degrees counterclockwise
	 *
	 * @param d	angle to rotate through in degrees
	 */
	public void rotateThisImage(double d)
	{
		// We will use a copy of this image
		Picture spare = new Picture(this);

		int w = this.getWidth();
		int h = this.getHeight();
		double a = d * Math.PI / 180.0;
		Color blank = new Color(255, 255, 255);
		for (int x = 0; x < w; x++) {
			for (int y = 0; y < h; y++) {
				/* convert the coordinates to the center reference */
				double xc = (double) x - w / 2;
				double yc = h / 2 - (double) y;

				/* find coordinates in the spare picture */
				double xs =  Math.cos(a) * xc + Math.sin(a) * yc;
				double ys = -Math.sin(a) * xc + Math.cos(a) * yc;

				/* convert the spare coordinates to picture reference frame */
				int xsp = (int)(xs + w / 2);
				int ysp = (int)(h / 2 - ys);

				/* if position is ok, copy the colour, otherwise fill white */
				Pixel p = this.getPixel(x, y);
				if (0 <= xsp && xsp < w &&
				    0 <= ysp && ysp < h)
					p.setColor(spare.getPixel(xsp, ysp).getColor());
				else
					p.setColor(blank);
			}
		}
	}


	/**
	 * Method applying a special effect - rotation 
	 *
	 */
	public void runEffect()
	{
		/* Rotate 30 degrees counterclockwise */
		rotateThisImage(60);
	}

	/**
	 * Apply edge detection
	 *
	 * @param	threshold	when to consider it an edge
	 *
	 */
	public void applyEdge(int threshold)
	{
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeight() - 1; y++) {
				int p = getBasicPixel(x, y);
				int q = getBasicPixel(x, y + 1);

				double above = (((p & 0xff0000) >> 16) + ((p & 0x00ff00) >> 8) + (p & 0x0000ff)) / 3.0;
			        double below = (((q & 0xff0000) >> 16) + ((q & 0x00ff00) >> 8) + (q & 0x0000ff)) / 3.0;

				if (Math.abs(above - below) > threshold)
					setBasicPixel(x, y, 0x000000);
				else
					setBasicPixel(x, y, 0xffffff);
			}
		}		
	}

	/**
	 * Turn picture into sepia
	 */
	public void applySepia()
	{
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeight() - 1; y++) {
				int p = getBasicPixel(x, y);
				int r = (p >> 16) & 0xff;
				int g = (p >> 8) & 0xff;
				int b = p & 0xff;

				if (r < 60) {
					r = (int)Math.round((double)r * 0.8);
					g = (int)Math.round((double)g * 0.8);
					b = (int)Math.round((double)b * 0.8);
				} else if (r < 190) {
					b = (int)Math.round((double)b * 0.6);
				} else {
					b = (int)Math.round((double)b * 0.8);
				}

				setBasicPixel(x, y, (r << 16) | (g << 8) | b);
			}
		}
	}

	/**
	 * Turn into a posterized form
	 *
	 */
	public void applyPosterization()
	{
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeight(); y++) {
				int p = getBasicPixel(x, y);
				int r = (p >> 16) & 0xff;
				int g = (p >> 8) & 0xff;
				int b = p & 0xff;

				/* posterize */
				r = (r / 64) * 64 + 31;
				g = (g / 64) * 64 + 31;
				b = (b / 64) * 64 + 31;

				setBasicPixel(x, y, (r << 16) | (g << 8) | b);
			}
		}
	}

	/**
	 * Make a sunset effect
	 */
	public void applySunset()
	{
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeight(); y++) {
				int p = getBasicPixel(x, y);
				int r = (p >> 16) & 0xff;
				int g = (p >> 8) & 0xff;
				int b = p & 0xff;

				/* sunsetize */
				g = (int)Math.round(g * 0.7);
				b = (int)Math.round(b * 0.7);

				setBasicPixel(x, y, (r << 16) | (g << 8) | b);
			}
		}
	}

	/**
	 * Lighten the image
	 */
	public void applyLighten(double scale)
	{
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeight(); y++) {
				int p = getBasicPixel(x, y);
				int r = (p >> 16) & 0xff;
				int g = (p >> 8) & 0xff;
				int b = p & 0xff;

				r = r * scale <= (double)0xff ? (int)Math.round(r * scale) : 0xff;
				g = g * scale <= (double)0xff ? (int)Math.round(g * scale) : 0xff;
				b = b * scale <= (double)0xff ? (int)Math.round(b * scale) : 0xff;

				setBasicPixel(x, y, (r << 16) | (g << 8) | b);
			}
		}
	}

	/**
	 * Turn picture into greyscale
	 */
	public void applyGrayScale()
	{
		for (int x = 0; x < getWidth(); x++) {
			for (int y = 0; y < getHeight(); y++) {
				int p = getBasicPixel(x, y);
				int grey = (int)(((p & 0xff0000) >> 16) * 0.299 + 
						 ((p & 0x00ff00) >> 8) * 0.587 + 
						 ((p & 0x0000ff) * 0.114) / 3.0); 
				setBasicPixel(x, y, (grey << 16) | (grey << 8) | grey);
			}
		}
	}


	public static final int EFFECT_EDGE = 0;
	public static final int EFFECT_SEPIA = 1;
	public static final int EFFECT_POSTERIZE = 2;
	public static final int EFFECT_SUNSET = 3;
	public static final int EFFECT_LIGHTEN = 4;
	public static final int EFFECT_GRAYSCALE = 5;
	public static final int EFFECT_NUMBER = 6;			/* No. effects */

	/**
	 * Apply an effect to a picture
	 *
	 * @param	effect	the number of the effect
	 * @param	picture	the picture to apply the effect to
	 */
	public void applyEffect(int effect, Picture picture)
	{
		switch (effect) {
		case EFFECT_EDGE:
			System.err.printf("Edge Detection Effect\n");
			picture.applyEdge(15);
			break;

		case EFFECT_SEPIA:
			System.err.printf("Sepia Toning\n");
			picture.applySepia();
			break;

		case EFFECT_POSTERIZE:
			System.err.printf("Posterization\n");
			picture.applyPosterization();
			break;

		case EFFECT_SUNSET:
			System.err.printf("Sunset Effect\n");
			picture.applySunset();
			break;

		case EFFECT_LIGHTEN:
			System.err.printf("Lighten Effect\n");
			picture.applyLighten(1.4);
			break;

		case EFFECT_GRAYSCALE:
			System.err.printf("Gray Scale\n");
			picture.applyGrayScale();			
			break;

		default:
		}
	}


	public static final int COLLAGE_CELL_WIDTH = 150;
	public static final int COLLAGE_CELL_HEIGHT = 100;
	/**
	 * Method creating a collage from a set of pictures
	 * Assumptions:
	 *	We resize each picture to size COLLAGE_CELL_WIDTH x COLLAGE_CELL_HEIGHT
	 *	We assume (and check) the picture to be large enough to hold the collage
	 *	Otherwise we print an error
	 *
	 * @param	pics	the array with pictures
	 */
	public void makeCollage(Picture pics[])
	{
		/* check that there is enough room on the picture */
		if (this.getHeight() < COLLAGE_CELL_HEIGHT * 2 + 50 ||
		    COLLAGE_CELL_HEIGHT * pics.length + 50 > this.getWidth()) {
			System.err.println("Background canvas of insufficient size");
			return;
		}

		Graphics2D g = (Graphics2D)(this.getGraphics());
		
		/* draw the first row */
		double trX = 50.0, trY = 50.0;
		for (Picture p: pics) {
			double w = (double)p.getWidth();
			double h = (double)p.getHeight();
			AffineTransform T = new AffineTransform();

			T.translate(trX, trY);
			T.scale(((double)COLLAGE_CELL_WIDTH) / w, ((double)COLLAGE_CELL_HEIGHT) / h);
			g.drawImage(p.getBufferedImage(), T, null);

			trX += COLLAGE_CELL_WIDTH;
		}

		/* draw the second row */
		trX = 50.0;
		trY += 50.0 + COLLAGE_CELL_HEIGHT;
		int[] effects = {					// a pre-set sequence of effects
			EFFECT_LIGHTEN,
			EFFECT_GRAYSCALE,
			EFFECT_POSTERIZE,
			EFFECT_SUNSET,
			EFFECT_SEPIA,
			EFFECT_EDGE
		};
		int currEffect = 0;
		for (Picture p: pics) {
			Picture n = new Picture(p);			// copy the picture to 'n' to modify

			/* uncomment this to apply effects randomly */
//			int effect = (int)Math.round(Math.random() * (EFFECT_NUMBER - 1));
//			applyEffect(effect, n);

			/* apply effects in the pre-set sequence */
			applyEffect(effects[(currEffect++) % EFFECT_NUMBER], n);

			double w = (double)n.getWidth();
			double h = (double)n.getHeight();
			AffineTransform T = new AffineTransform();

			T.translate(trX, trY);
			T.scale(((double)COLLAGE_CELL_WIDTH) / w, ((double)COLLAGE_CELL_HEIGHT) / h);
			g.drawImage(n.getBufferedImage(), T, null);

			trX += COLLAGE_CELL_WIDTH;
		}
	}


	/**
	 * Draw a collage of a few pictures on top of the current one
	 *
	 */
	public void drawCollage()
	{
		Picture[] pList = {
			new Picture("images/flower1.jpg"),
			new Picture("images/flower2.jpg"),
			new Picture("images/flower3.jpg"),
			new Picture("images/flower4.jpg"),
			new Picture("images/flower5.jpg"),
			new Picture("images/flower6.jpg")
		};
		makeCollage(pList);
	}
} // end of class Picture, put all new methods before this

