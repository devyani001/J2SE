import java.io.*;

public class FinalVelocityBufferedReader
{
	public static void main( String args[] )  throws IOException
	{

		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.print("Enter Initaial Velocity(v) : ");
		double u = Double.parseDouble( br.readLine() );

		System.out.print("Enter Acceleration(a)      : ");
		double a = Double.parseDouble( br.readLine() );

		System.out.print("Enter Time(t) 		   : ");
		double t = Double.parseDouble( br.readLine() );

		double v = u + a * t;

		System.out.println("Final Velocity : " + v);

	}
}