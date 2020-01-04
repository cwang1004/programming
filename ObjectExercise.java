import java.util.*;
public class ObjectExercise
{
	public static void main(String[] args)
	{
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number:");
		int a = input.nextInt();
		System.out.println("Enter your second number:");
		int b = input.nextInt();
		// method1();
		System.out.println("The sum:");
		System.out.println(method2(a, b));
		System.out.println("\n");
		System.out.println("Other program:");
		int value = method2(a, b);
		System.out.println(value + 2);
		System.out.println("\n");
		System.out.println("Other program:");
		int c = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		int inputTimes = 0;
		while(c < 3)
		{
			System.out.println("Enter an number:");
			inputTimes++;
			if(inputTimes == 1)
			{
				x = input.nextInt();
			}
			else if(inputTimes == 2)
			{
				y = input.nextInt();
			}
			else
			{
				z = input.nextInt();
			} 
			c++;
		}
		System.out.println("\n" + x);
		System.out.println(y);
		System.out.println(z);
		*/
		int[] arr = {1,2,3};
		System.out.println(arr[0]);
		int[] arr2 = new int[100];
		System.out.println(arr2[1]);
	}

	public static void method1()
	{
		System.out.println("Hello");
	}

	public static int method2(int a, int b)
	{
		return a + b;
	}
}