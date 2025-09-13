import java.io.*;
import java.util.Scanner;

public class CylinderDemoScanner
{
	public static void main( String args[] )
	{

		final float PI = 3.14f;

		Scanner sc = new Scanner( System.in );		

		System.out.print("Enter the radius : ");
		double radius = sc.nextDouble();

		System.out.print("Enter the height : ");
		double height = sc.nextDouble();

		double SurfaceArea = (2 * PI * radius) * (radius + height);
		double Volume 	   = PI * radius * radius * height;

		System.out.println("Surface Area of a Cylinder using Scanner : " + SurfaceArea);
		System.out.println("Volume       of a Cylinder using Scanner : " + Volume);

	}
}