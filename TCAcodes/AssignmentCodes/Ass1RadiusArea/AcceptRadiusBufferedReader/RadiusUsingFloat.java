package AcceptRadiusBufferedReader;
import java.io.*;

public class RadiusUsingFloat
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the Radius : ");
		float r = Float.parseFloat(br.readLine());		// here Float -> class name capital 'F'.

		float area = 3.14f * r * r;
		
		System.out.println("Area : " + area);
	}
}