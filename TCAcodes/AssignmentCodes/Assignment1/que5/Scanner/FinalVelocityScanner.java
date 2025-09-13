import java.io.*;
import java.util.Scanner;

public class FinalVelocityScanner
{
	public static void main( String args[] )
	{

		Scanner sc = new Scanner( System.in );

		System.out.print("Enter Initaial Velocity(v) : ");
		double u = sc.nextDouble();

		System.out.print("Enter Acceleration(a)      : ");
		double a = sc.nextDouble();

		System.out.print("Enter Time(t) 		   : ");
		double t = sc.nextDouble();

		double v = u + a * t;

		System.out.println("Final Velocity : " + v);

	}
}