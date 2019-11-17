import java.util.*;
public class RockPaperScissors
{
	public static void main(String[] args)
	{
		int cotinuee = 1;
		while(cotinuee == 1)
		{
			Scanner input = new Scanner(System.in);
			int plOption = 9999999;

			while(plOption > 3 || plOption < 1)
			{
				System.out.println("Enter your option: Type 1 for Rock, Type 2 for Paper or Type 3 for Scissor.");
				plOption = input.nextInt();
			}

			Random randomizer = new Random();
			int compOption = randomizer.nextInt(3) + 1;

			showOptions(plOption, compOption);
			rusults(plOption, compOption);

			cotinuee = 0;
			while(cotinuee > 2 || cotinuee < 1)
			{
				System.out.println("Do you want to play again? 1 for yes and 2 for no");
				cotinuee = input.nextInt();
			}
		}
	}

	public static void printRock()
	{
		System.out.println("");
		System.out.println("  I'm A Rock");
		System.out.println("  *********");
		System.out.println(" * O     O *");
		System.out.println(" *         *");
		System.out.println(" * *     * *");
		System.out.println(" *  * * *  *");
		System.out.println("  *********");
		System.out.println("");
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

	public static void showOptions(int plOption, int compOption)
	{
		System.out.println("\nPlayer:");
		if(plOption == 1)
		{
			printRock();
		}
		else if(plOption == 2)
		{
			printPaper();
		} 
		else
		{
			printScissor();
		}

		System.out.println("Computer:");
		if(compOption == 1)
		{
			printRock();
		}
		else if(compOption == 2)
		{
			printPaper();
		} 
		else
		{
			printScissor();
		}
	}

	public static void rusults(int plOption, int compOption)
	{
		int result = compOption - plOption;
		if(result == 0)
		{
			System.out.println("It's a draw!");
		}
		else if(result == 1 || result == -2)
		{
			System.out.println("Damn computer wins");
		}
		else
		{
			System.out.println("you win! :-)");
		}
	}
}