// class is the blueprint of a object
//object is a data type
//scanner is a object type
//scanner scans
//
import java.util.*;
public class inputTest
{
	public static void main(String[] args)
	{
		Scanner/* blueprint */ smile/* smile=name */ = new Scanner/* Making a house called smile*/(System.in);
		while(true)//
		{	
			int option = 0;
			while(option > 3 || option < 1)
			{
				System.out.println("Enter your option: Rock=1, Paper=2, or Sissors=3");
				option = smile.nextInt/**/();
			}

			if(option == 1)
			{
				printRock();
			}
			else if(option == 2)
			{
				printPaper();
			}
			else
			{
				printScissor();
			}

			if(option == 1)
			{
				printGun();
				System.out.println("I won loser");
			} 
			else if(option == 2)
			{
				printGun();
				System.out.println("I won lol");
			}
			else
			{
				printGun();
				System.out.println("I won. yay.");
			}	
		}
			
	}

	public static void printScissor()
	{
		System.out.println(" **    ** ");
		System.out.println(" * *  * * ");
		System.out.println("  * ** *  ");
		System.out.println("   *OO*   ");
		System.out.println("   ****   ");
		System.out.println("  **--**  ");
		System.out.println(" ***  *** ");
		System.out.println(" * *  * * ");
		System.out.println(" **    ** ");
		System.out.println("          ");
	}

	public static void printPaper()
	{
		System.out.println("   * * *");
		System.out.println("  * * * *");
		System.out.println(" ** * * *");
		System.out.println("* *o* *o*");
		System.out.println("* * * * *");
		System.out.println("*  ---- *");
		System.out.println(" *     * ");
		System.out.println("   *  *");
		System.out.println("   *  *");
		System.out.println("   *  *");
	}

	public static void printRock()
	{
		System.out.println("");
		System.out.println("  I'm A Rock");
		System.out.println("  *********");
		System.out.println(" * *     * *");
		System.out.println(" *         *");
		System.out.println(" * *     * *");
		System.out.println(" *  * * *  *");
		System.out.println("  ********* ");
	}

	public static void printGun()
	{
		System.out.println("I'm a gun");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("*** **");
		System.out.println("*** * ");
		System.out.println("****");
		System.out.println("***");
	}
}
/* 
Data type
Type object
Scanner(type) input(Name of variable) = new scanner(system.in)

*/