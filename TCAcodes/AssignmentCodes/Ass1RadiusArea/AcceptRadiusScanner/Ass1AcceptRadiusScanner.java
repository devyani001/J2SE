import java.util.*;

public class Ass1AcceptRadiusScanner
{
	public static void main( String args[] )
	{

		final double PI = 3.14;

		Scanner sc = new Scanner(System.in);
// 								 Keyboard

		System.out.print("Enter radius = ");
		double r = sc.nextInt();

		double area = 3.14 * r * r;

		System.out.println("Area is : " + area);

	}
}

// const float PI = 3.14;
// capital letter PI
// double area = (float) Math.PI * r * r;