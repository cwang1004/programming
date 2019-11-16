import java.util.*;
public class RockPaperScissors2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		playerOption = 6666;

		while(playerOption < 1 || playerOption > 3)
		{
			System.out.println("Enter your option: 1=Rock, 2=Paper and 3=Scissor");	
			option = input.nextInt();
		}

		Random randomizer = new Random();
		int computerOption = randomizer.nextInt(3) + 1;
		int i = 0;
		while(i < 10)
		{
			System.out.println(computerOption);
			computerOption = randomizer.nextInt(3) + 1;
			i++;
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

