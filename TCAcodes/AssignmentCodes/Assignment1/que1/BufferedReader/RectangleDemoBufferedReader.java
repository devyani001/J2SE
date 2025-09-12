import java.io.*;

public class RectangleDemoBufferedReader
{
	public static void main( String args [] ) throws IOException
	{

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.print("Enter the length : ");
		double length = Double.parseDouble( br.readLine() );

		System.out.print("Enter the breadth : ");
		double breadth = Double.parseDouble( br.readLine() );

		double perimeter = 2 * ( length + breadth );
		double area 	 = length * breadth;

		System.out.println("Perimeter of Rectangle using BufferedReader : " + perimeter);
		System.out.println("Area 	  of Rectangle using BufferedReader : " + area);

	}
}