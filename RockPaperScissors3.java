/*
-class is a blue print of an object
-

*/



import java.util.*;

public class RockPaperScissore
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int option = 0;

		while(option < 1 || option > 3)
		{
			System.out.println("Enter your option 1-rock 2-paper 3-scissors");
			option = input.nextInt();
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
		System.out.println();
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

	public static void printRock()
	{
		System.out.println("");
		System.out.println("  I'm A Rock");
		System.out.println("  *********");
		System.out.println(" * *    *  *");
		System.out.println(" *         *");
		System.out.println(" * *     * *");
		System.out.println(" *  * * *  *");
		System.out.println("  *********");
		System.out.println("");	
	}
}
  

