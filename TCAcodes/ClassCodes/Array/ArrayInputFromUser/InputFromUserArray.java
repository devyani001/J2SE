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

		/* Array accepting Logic */

		for(int i=0; i < a.length; i++)
		{
			System.out.print("Enter the data : ");
			a[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Data : " + Arrays.toString(a));

		/* Sum calculation Logic */

		int ans = 0;

		for(int i=0; i < a.length; i++)
		{
			ans = ans + a[i];
		}

		System.out.println("Sum  : " + ans);
	}
}