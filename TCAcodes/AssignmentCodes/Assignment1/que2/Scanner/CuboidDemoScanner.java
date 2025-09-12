import java.io.*;
import java.util.Scanner;

public class CuboidDemoScanner
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner( System.in );

		System.out.print("Enter the length  : ");
		double length = sc.nextDouble();

		System.out.print("Enter the breadth : ");
		double breadth = sc.nextDouble();

		System.out.print("Enter the height  : ");
		double height = sc.nextDouble();

		double SurfaceArea = 2 * ( (length * breadth) + (breadth * height) + (height * length) );

		System.out.println("Surface Area of Cuboid using Scanner : " + SurfaceArea);
	}
}