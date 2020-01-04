/*
-class is a blue print of an object
*/


import java.util.*;

public class RockPaperScissore
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int playerOption = 0;

		while(playerOption < 1 || playerOption > 3)
		{
			System.out.println("Enter your option 1-rock 2-paper 3-scissors");
			playerOption = input.nextInt();
		}

		Random randomizer = new Random();
		int computerOption =randomizer.nextInt(3) + 1;
		showOptions(playerOption, computerOption);
		printresult(playerOption, computerOption);
	}

	public static void showOptions(int player, int computer)
	{
		System.out.println("player option");
		if(player == 1)
		{
			printRock();
		}
		else if(player == 2)
		{
			printPaper();
		}
		else
		{
			printScissor();
		}
		System.out.println("computer option");
		if(computer == 1)
		{
			printRock();
		}
		else if(computer == 2)
		{
			printPaper();
		}
		else
		{
			printScissor();
		}
	}

	public static void printresult(int player, int computer)
	{
		int result = computer - player;
		if(result == 1 || result == -2)
		{
			System.out.println("you lost");
		}
		 else if(result == 0)
		{
			System.out.println("draw");
		}
		else
		{
			System.out.println("you win");
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
  

