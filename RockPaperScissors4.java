import java.util.*;
public class RockPaperScissors4   
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		playerOption = 6666;

		while(playerOption < 1 || playerOption > 3)
		{
			System.out.println("Enter your option: 1=Rock, 2=Paper and 3=Scissor");	
			playerOption = input.nextInt();
		}

		Random randomizer = new Random();
		int computerOption = randomizer.nextInt(3) + 1;
		showOption(playerOption, computerOption);
		printResults();
	}

	public static void showOptions(int player, int computer)
	{
		System.out.println("player")
		if(player==1)
		{
			printRock();
		}
		else if(player==2)
		{
			printPaper();
		}
		else(player==3)
		{
			printScissor();
		}

		System.out.println("computer")
		if(computer==1)
		{
			printRock();
		}
		else if(computer==2)
		{
			printPaper();
		}
		else(coputer==3)
		{
			printScissor();
		}
	}
	public static void printResults(int player, int computer)
	{
		int result = computer - player;
	    if( result == 1 || result == -2)
		{
			System.out.println("you lost ");
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
}