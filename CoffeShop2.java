public class CoffeeShop2
{
	public static void main(String[] args)
	{
		int q = 0;
		double price = 1.5;
		double total = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("how many cups of coffee?");
		q = input.nextInt();
		total = q * price;

		System.out.println("-----------------");
		System.out.println("Quantity: " + q);
		System.out.println("Price: " + price);
		System.out.println("total: " q + "x" + price + "=" + total);
	}
}