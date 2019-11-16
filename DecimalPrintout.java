/*
API means Library.
I think it is an important tool for programmers
because sometimes there just isn't a magical
java fairy that tells you everything.
nextDouble() 
Returns the next pseudorandom, 
uniformly distributed double value between 0.0 and 1.0 from this random number generator's sequence.
*/
import java.util.*;
public class DecimalPrintout
{
	public static void main(String[] args)
	{
		printout1();
		System.out.println("");
		printout2();
	}

	public static void printout1()
	{
		Random randomizer = new Random();
		double random1 = randomizer.nextDouble();
		int a = 0;
		while(a < 10)
		{
			System.out.println(random1);
			random1 = randomizer.nextDouble();
			a++;
		}
	}

	public static void printout2()
	{
		Random randomizer2 = new Random();
		double random2 = randomizer2.nextDouble();
		random2 = (random2 * 10) + 9.99;
		int b = 0;
		while(b < 10)
		{
			System.out.println(random2);
			random2 = randomizer2.nextDouble();
			random2 = (random2 * 10) + 9.99;
			b++;
		}
	}
}