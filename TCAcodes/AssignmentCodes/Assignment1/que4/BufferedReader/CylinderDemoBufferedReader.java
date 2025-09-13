import java.io.*;

public class CylinderDemoBufferedReader
{
	public static void main( String args[] ) throws IOException
	{

		final float PI = 3.14f;

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.print("Enter the radius : ");
		double radius = Double.parseDouble( br.readLine() );

		System.out.print("Enter the height : ");
		double height = Double.parseDouble( br.readLine() );

		double SurfaceArea = (2 * PI * radius) * (radius + height);
		double Volume 	   = PI * radius * radius * height;

		System.out.println("Surface Area of a Cylinder using BufferedReader : " + SurfaceArea);
		System.out.println("Volume       of a Cylinder using BufferedReader : " + Volume);

	}
}