import java.io.*;

public class Ass1AcceptRadius
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the Radius : ");
		int r = Integer.parseInt(br.readLine());

		double area = 3.14 * r * r;

		System.out.println("Area : " + area);
	}
}