import java.util.*;
public class RPSpractice
{
	public static void main(String[] args)
	{
		int contiinue = 1;
		while(contiinue == 1)
		{
			Scanner input = new Scanner(System.in);
			int playerOption = 999;

			while(playerOption > 3 || playerOption < 1)
			{
				System.out.println("Choose your option. 1-rock, 2- Scissor, 3-Paper");
				playerOption = input.nextInt();
			}

			Random randomizer = new Random();
			int computerOption = randomizer.nextInt(3) + 1;
			printOptions(playerOption, computerOption);
		}
	}

		public static void printRock()
	{
		System.out.println("");
		System.out.println("  I'm A Rock");
		System.out.println("  *********");
		System.out.println(" * O     O *");
		System.out.println(" *         /*");
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

	public static void printOptions(int computerOption,int playerOption)
	{
		System.out.println("\nPlayer Plays:");
		if(playerOption == 1)
		{
			printRock();
		}
		else if(playerOption == 2)
		{
			printScissor();
		}
		else
		{
			printPaper();
		}
		System.out.println("\nComputer Plays:");
		if(computerOption == 1)
		{
			printRock();
		}
		else if(computerOption == 2)
		{
			printScissor();
		}
		else
		{
			printPaper();
		}
	}
	public static void analyzeResults(int playerOption,int computerOption)
	{
		int result = computerOption - playerOption;
	}
}