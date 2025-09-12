import java.io.*;

public class ReadInput
{
	public static void main(String args[]) throws IOException 
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter first number : ");
			
			int a = Integer.parseInt(br.readLine());

			System.out.print("Enter second number : ");

			int b = Integer.parseInt(br.readLine());

			int ans = a + b;

			System.out.println("Addition = " + ans);

	}
}