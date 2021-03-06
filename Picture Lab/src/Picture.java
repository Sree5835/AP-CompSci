import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	// /////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super()
		 * child constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName
	 *            the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height
	 *            the height of the desired picture
	 * @param width
	 *            the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture
	 *            the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image
	 *            the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	// //////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName,
	 *         height and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height "
				+ getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	/** Method to set the red and green to 0 */
	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	/** Method to negate colors */
	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
			}
		}
	}

	/** Method to make grayscale colors */
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int color = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj
						.getBlue()) / 3;
				pixelObj.setRed(color);
				pixelObj.setGreen(color);
				pixelObj.setBlue(color);
			}
		}
	}

	/** Method to make grayscale colors */
	public void makeGrain() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if (pixelObj.getRed() % 2 == 0) {
					pixelObj.setRed(pixelObj.getRed() - 30);
				} else {
					pixelObj.setRed(pixelObj.getRed()+30);
				}
				if (pixelObj.getGreen() % 2 == 0) {
					pixelObj.setGreen(pixelObj.getGreen() - 30);
				} else {
					pixelObj.setGreen(pixelObj.getGreen()+30);
				}
				if (pixelObj.getBlue() % 2 == 0) {
					pixelObj.setBlue(pixelObj.getBlue() - 30);
				} else {
					pixelObj.setBlue(pixelObj.getBlue()+30);
				}
				// int color =
				// (pixelObj.getRed()+pixelObj.getGreen()+pixelObj.getBlue())/3;
				// pixelObj.setRed(color);
				// pixelObj.setGreen(color);
				// pixelObj.setBlue(color);
			}
		}
	}

	/** Method to make fish pop out */
	public void fixUnderWater() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if (pixelObj.getBlue() >= 170)
					pixelObj.setBlue(240);
				pixelObj.setBlue(pixelObj.getBlue() - 28);

			}
		}
	}

	/** Method to make sepia color */
	public void sepia() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int outputRed = (int) ((pixelObj.getRed() * .393)
						+ (pixelObj.getGreen() * .769) + (pixelObj.getBlue() * .189));
				int outputGreen = (int) ((pixelObj.getRed() * .349)
						+ (pixelObj.getGreen() * .686) + (pixelObj.getBlue() * .168));
				int outputBlue = (int) ((pixelObj.getRed() * .272)
						+ (pixelObj.getGreen() * .534) + (pixelObj.getBlue() * .131));

				pixelObj.setRed(outputRed);
				pixelObj.setGreen(outputGreen);
				pixelObj.setBlue(outputBlue);

			}
		}
	}

	/** Method that places a black square at a spot */
	public void blackOutFaces() {
		Pixel[][] pixels = this.getPixels2D();
		int firstRow = 190;
		int firstCol = 300;
		int secRow = 197;
		int secCol = 220;
		int thirdRow = 169;
		int thirdCol = 275;
		int l = 30;
		int w = 30;
		for (int i = firstRow; i < firstRow + w; i++) {
			for (int j = firstCol; j < firstCol + l; j++) {
				pixels[i][j].setBlue(0);
				pixels[i][j].setRed(0);
				pixels[i][j].setGreen(0);
			}
		}
		for (int i = secRow; i < secRow + w; i++) {
			for (int j = secCol; j < secCol + l; j++) {
				pixels[i][j].setBlue(0);
				pixels[i][j].setRed(0);
				pixels[i][j].setGreen(0);
			}
		}
		for (int i = thirdRow; i < thirdRow + w; i++) {
			for (int j = thirdCol; j < thirdCol + l; j++) {
				pixels[i][j].setBlue(0);
				pixels[i][j].setRed(0);
				pixels[i][j].setGreen(0);
			}
		}

	}
/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from left to right
	 */
	public void mirrorHorizontal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int height = pixels.length;
		for (int row = 0; row < height/2; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[height - 1 - row][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}
	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from right to left
	 */
	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				leftPixel.setColor(rightPixel.getColor());
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of
	 * the picture from right to left
	 */
	public void mirrorPartOfAPic() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel upPixel = null;
		Pixel downPixel = null;
		int width = pixels[0].length;
		int height = pixels.length;

		for (int col = 0; col < width; col++) {
			for (int row = 0; row < height / 2; row++) {
				upPixel = pixels[row][col];
				downPixel = pixels[row][width - 1 - col];
				downPixel.setColor(upPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in
	 * the current picture
	 * 
	 * @param fromPic
	 *            the picture to copy from
	 * @param startRow
	 *            the start row to copy to
	 * @param startCol
	 *            the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	
	public void chromakey (Picture fromPic) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = 0; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = 0; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				if(!(toPixel.getRed()>=240&&toPixel.getBlue()>=240&&toPixel.getGreen()>=240)){
					fromPixel = fromPixels[fromRow][fromCol];
					toPixel = toPixels[toRow][toCol];
					toPixel.setColor(fromPixel.getColor());
				}
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist
	 *            the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
//		Picture classPic = new Picture("Period 2 2019.jpg");
//		Picture scaledPic = classPic.scale(.2, .2);
//		scaledPic.explore();
//		scaledPic.makeGrain();
		//Picture me = new Picture("me.jpg");
		//Picture k = new Picture("koala.jpg");
		//me.chromakey(k);
	}

} // this } is the end of class Picture, put all new methods before this
