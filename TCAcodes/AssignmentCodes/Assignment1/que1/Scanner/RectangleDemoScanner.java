import java.io.*;
import java.util.Scanner;

public class RectangleDemoScanner
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner( System.in );

		System.out.print("Enter the length  : ");
		double length = sc.nextDouble();

		System.out.print("Enter the breadth : ");
		double breadth = sc.nextDouble();

		double perimeter = 2 * ( length + breadth );
		double area 	 = length * breadth;

		System.out.println( "Perimeter of Rectangle using Scanner : " + perimeter );
		System.out.println( "Area 	  of Rectangle using Scanner : " + area );

	}
}