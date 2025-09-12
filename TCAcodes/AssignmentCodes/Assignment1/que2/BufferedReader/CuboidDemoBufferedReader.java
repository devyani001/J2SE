import java.io.*;

public class CuboidDemoBufferedReader
{
	public static void main( String args[] ) throws IOException
	{

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.print("Enter the length  : ");
		double length  = Double.parseDouble( br.readLine() );

		System.out.print("Enter the breadth : ");
		double breadth = Double.parseDouble( br.readLine() );

		System.out.print("Enter the height  : ");
		double height  = Double.parseDouble( br.readLine() );

		double SurfaceArea = 2 * ((length * breadth) + (breadth * height) + (height * length));

		System.out.println("Surface Area of Cuboid using BufferedReader : " + SurfaceArea);

	}
}