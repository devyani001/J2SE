import java.io.*;
import java.util.Arrays;

public class InputFromUserArray
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

		System.out.print("How many number : ");
		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];

		for(int i=0; i < a.length; i++)
		{
			System.out.print("Enter the data : ");
			a[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Data : " + Arrays.toString(a));
	}
}