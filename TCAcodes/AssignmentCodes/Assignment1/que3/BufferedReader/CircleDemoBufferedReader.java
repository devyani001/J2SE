import java.io.*;

public class CircleDemoBufferedReader
{
	public static void main( String args[] ) throws IOException
	{

		final float PI = 3.14f;

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.println("Enter the radius : ");
		double radius = Double.parseDouble( br.readLine() );

		double area = 2 * PI * radius;
		float  circumference = PI * (float)radius * (float)radius;

		System.out.println("Area of circle using BufferedReader 		   : " + area);
		System.out.println("Circumference of a circle using BufferedReader : " + circumference);

	}
}