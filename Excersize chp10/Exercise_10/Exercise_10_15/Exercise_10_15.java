/*********************************************************************************
* (Geometry: the bounding rectangle) A bounding rectangle is the minimum         *
* rectangle that encloses a set of points in a two-dimensional plane, as shown   *
* in Figure 10.24d. Write a method that returns a bounding rectangle for a set   *
* of points in a two-dimensional plane, as follows:                              *
*                                                                                *
* public static MyRectangle2D getRectangle(double[][] points)                    *
*                                                                                *
* The Rectangle2D class is defined in Programming Exercise 10.13. Write a test   *
* program that prompts the user to enter five points and displays the bounding   *
* rectangle’s center, width, and height.                                         *
*********************************************************************************/
import java.util.Scanner;

public class Exercise_10_15 {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create 5 x 2 matrix
		double[][] points = new double[5][2];

		// Prompt the user to enter five points
		System.out.print("\nEnter five points: ");
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}

		MyRectangle2D r1 = MyRectangle2D.getRectangle(points);

		System.out.println("The bounding rectangle's center (" + r1.getX() + ", " + 
			r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
	}
}