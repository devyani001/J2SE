/*java madhe kuthlihi gosti capital letter ni suru honari asel tr ti class name aste.

out.println("Hello World");
ob.display("Hello World");
out 	- object
println - function
System 	- class (ji gosht capital letter ni suru hoti ti class ahe in java by default)

C madhe goshti 'include' krtat
Java madhe goshti 'import' krtat

	class PrintStream
	{
		void println()
		{
	
		}
	}

	PrintStream out;
	out.println();

	here,

	class Abc
	{
		int a;
		int b;
		int c;

		void accept()
		{
	
		}

		void display()
		{
	
		}

		void show()
		{
	
		}
	}

	ob.a;
	ob.b;
	Abc.c;		ji gosht capital letter ni suru hoti ti class ahe in java by default
				mhnun 'System','String','Demo' ky ahe 'class'.

	pn kru skto, member access krayla tumhala ky lagte object kiva class name
	1) object 		- non static
	2) class name	- static member, function



	can u explain 'System.out.println()' ?
	----------------------------------------
	--> System is a class.
	--> out is object of PrintStream class, declared in System class as a 
		println() is non-static method which declared in PrintStream class.

*/

import java.io.*;
public class Demo
{
	public static void main(String args[])
	{
		System.out.println("Hello World!");
	}
}

/*
	D:\2025\J2SE\TCAcodes>javac Demo.java
		- ithe Demo ky ahe file name
	D:\2025\J2SE\TCAcodes>java Demo
		- But ithe Demo h 'class name' ahe
		- Coz tya class madhe 'main' ahe ani main ksa ahe 'static' ahe
		- ani static goshti kshya access hotat class chya navane.
	Hello World!

	

*/