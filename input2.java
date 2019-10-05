import java.util.*;
public class input2
{
	public static void main(String[] args)
	{
		Scanner smile = new Scanner(System.in);
		while(true)
		{	
			int option = 0;
			while(option > 3 || option < 1)
			{
				System.out.println("Enter your option: Rock=1, Paper=2, or Sissors=3 or bigger");
				option = smile.nextInt();
			}

			if(option == 1)
			{
				printRock();
			}
			else if(option == 2)
			{
				printPaper();
			}
			else
			{
				printScissor();
			}
		}
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
	}
}
/* 
Data type
Type object
Scanner(type) input(Name of variable) = new scanner(system.in)

*/