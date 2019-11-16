/*
foo = 2
foo = 2
foo = 3
bar = 0
foo = 19
bar = 20
j = 10
randomness means that you can't accuratly predict it.
API means Library.
Coin flip!
Because it prevents cheating
YES
No it's not because it's not equal

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
		System.out.println("");
		printout3();
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
		random2 = (random2 * 10) + 10;
		int b = 0;
		while(b < 10)
		{
			System.out.println(random2);
			random2 = randomizer2.nextDouble();
			random2 = (random2 * 10) + 9.99;
			b++;
		}
	}

	public static void printout3()
	{
		Random randomizer3 = new Random();
		int random3 = randomizer3.nextInt();
		int c = 0;
		while(c < 20)
		{
			System.out.println(random3);
			random3 = randomizer3.nextInt(89) + 11;
			c++;
		}
	}
}