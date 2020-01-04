/*
 i. Class is a blueprint of an object
 ii. we mean that we take the blueprints of the
 Scanner and make a new Scanner
 iii.the paremeters are the differences
 iv.
*/
import java.util.*;
public class RockPaperScissors
{
	public static void main(String[] args)
	{
		int continuee = 1;
		while(continuee == 1)
		{
			Scanner input = new Scanner(System.in);
			int playerOption = 9999999;

			while(playerOption > 3 || playerOption < 1)
			{
				System.out.println("Enter your option: Type 1 for Rock, Type 2 for Paper or Type 3 for Scissor.");
				playerOption = input.nextInt();
			}

			Random randomizer = new Random();
			int computerOption = randomizer.nextInt(3) + 1;
			showOptions(playerOption, computerOption);
			System.out.println("");
			analyzeResults(playerOption, computerOption);
			
			continuee--;
			while(continuee > 2 || continuee < 1)
			{
				System.out.println("Do you want to play again? 1 for yes, 2 for no");
				continuee = input.nextInt();
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

	public static void showOptions(int playerOption, int computerOption)
	{
		System.out.println("\nPlayer Plays");
		if(playerOption == 1)
		{
			printRock();
		}
		else if(playerOption == 2)
		{
			printPaper();
		}
		else
		{
			printScissor();
		}
		System.out.println("Computer Plays");
		if(computerOption == 1)
		{
			printRock();
		}
		else if(computerOption == 2)
		{
			printPaper();
		}
		else
		{
			printScissor();
		}
	}

	public static void analyzeResults(int playerOption,int computerOption)
	{
		int result = computerOption - playerOption;
		if(result == 0)
		{
			System.out.println("It's a draw!");
		}
		else if(result == 1 || result == -2)
		{
			System.out.println("Computer wins!");
		}
		else
		{
			System.out.println("Player wins!");
		}
	}
}



