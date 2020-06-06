import java.util.*;
public class CoffeeShop2
{
	public static void main(String[] args)
	{
		int q = 0;
		double price = 1.5;
		double sPrice = 2.5;
		double total = 0;
		String daily = "cake";

		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println("Today's Daily Special: " + daily + " Price: " + sPrice);
		System.out.println("~~~~~~~~~~~~~~~~~");

		Scanner input = new Scanner(System.in);
		System.out.println("Do you want Daily Special? yes or no");
		String yesRno = input.nextLine();
		
		System.out.println("how many cups of coffee?");
		q = input.nextInt();
		total = q * price;

		System.out.println("-----------------");
		System.out.println("Quantity: " + q);
		System.out.println("Price: " + price);
		if(yesRno.equals("yes"))
		{
			total += sPrice;
			System.out.println("total: " + q + " x " + price + " + " + sPrice + " = " + total);
		}
		else
		{
			System.out.println("total: " + q + " x " + price + " = " + total);
		}
		System.out.println("-----------------");
	}
}