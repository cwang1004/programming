import java.util.*;
public class RPS
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		while(true)
		{
			int option = 0;
			while (option > 3 || option < 1)
			{
				System.out.println("Enter your option: Type 1 for Rock, Type 2 for Paper or Type 3 for Scissor.");
				option = input.nextInt();
			}

			if(option == 1)
			{
				printRock();
			}
			else if(option == 2)
			{
				printScissor();
			}
			else
			{
				printPaper();
			}

			if(option == 123)
			{
				printRock();
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
}