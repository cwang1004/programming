public class Methods2
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;
		int c = 15;
		int[] arr = new int[5];
		System.out.println(arr[4]);

		//System.out.println(sum(a, multiply(c, 2)));	
	}

	public static int sum(int a, int b)
	{
		return multiply(a, 2) + b;			
	}

	public static int multiply(int a, int b)
	{
		return a * b;
	}
}