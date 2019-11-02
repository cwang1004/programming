import java.util.*;
public class RockPaperScissors2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int plOption = 0;

		while(plOption < 1 || plOption > 3)
		{
			System.out.println("Enter your option: 1=Rock, 2=Paper and 3=Scissor");	
			plOption = input.nextInt();
		}

		Random randomizer = new Random();
		int compOption = input.nextInt(3) + 1;
		int a = 0;
		while(a < 10)
		{ 
		 	System.out.println(compOption);
			compOption = input.nextInt(3) + 1;
			a++1;
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

