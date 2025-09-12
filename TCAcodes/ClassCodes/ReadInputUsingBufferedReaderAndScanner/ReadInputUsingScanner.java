import java.io.*;
import java.util.Scanner;

public class ReadInputUsingScanner
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");
		int a = sc.nextInt();

		System.out.print("Enter second number : ");
		int b = sc.nextInt();

		int ans = a + b;

		System.out.println("Addition = " + ans);
	}
}