import java.util.*;

public class RPS3
{
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

	public static void main(String[] args)
	{

		String myName = "neil";
		double height = 1.4;
		int age = 10;
		Scanner input = new Scanner(System.in);
		while (true)
		{
			int poop = 0;
			while(poop > 3 || poop < 1)
			{
				System.out.println("Enter your option 1-rock 2-paper 3-scissors");
				poop = input.nextInt();
			}
			if(poop == 1)
			{
				printRock();
			}
			else if(poop == 2)
			{
				printPaper();
			}
			else
			{
				printScissor();
			}
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
}	