public class Calculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int a = input.nextInt();
		System.out.println("Enter your second number:");
		int b = input.nextInt();
		System.out.println("The sum:");
		System.out.println(method2(a, b));
		System.out.println("\n");
	}

		public static int method2(int a, int b)
	{
		return a + b;
	}
}