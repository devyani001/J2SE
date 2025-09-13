import java.io.*;
import java.util.Scanner;

public class CircleDemoScanner
{
	public static void main( String args[] )
	{

		final float PI = 3.14f;

		Scanner sc = new Scanner( System.in );

		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();

		double area = 2 * PI * radius;
		float  circumference = PI * (float)radius * (float)radius;

		System.out.println("Area of circle using Scanner 			: " + area);
		System.out.println("Circumference of a circle using Scanner : " + circumference);

	}
}