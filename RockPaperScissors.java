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
		Scanner input = new Scanner(System.in);
		int playerOption = 9999999;

		while(playerOption > 3 || playerOption < 1)
		{
			System.out.println("Enter your option: Type 1 for Rock, Type 2 for Paper or Type 3 for Scissor.");
			playerOption = input.nextInt();
		}

		Random randomizer = new Random();
		int computerOption = randomizer.nextInt(3) + 1;
		int a = 0;
		while(a < 10)
		{
			System.out.println(computerOption);
			computerOption = randomizer.nextInt(3) + 1;
			a++;
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
}



