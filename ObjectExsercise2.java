//import java.util.*;
public class ObjectExsercise2
{
	public static void main(String[] args)
	{
		method1();
		method2(2, 2);
		int ls = method2(2, 2);
		ls += 2; 
		System.out.println(ls);
		int[] arr = {1, 2, 3};
		int[] arr2 = new int[100];
		System.out.println(arr2[99]);
		/*Scanner number = new Scanner(System.in);
		int loop = 0;
		int ni = 0;
		int nii = 0;
		int niii = 0;

		while(loop < 1)
		{
			System.out.println("give a number");
			ni = number.nextInt();
			System.out.println("give a number again");
			nii = number.nextInt();
			System.out.println("give a number again again");
			niii = number.nextInt();
			loop ++;
		} */
	}

	public static void method1()
	{
		System.out.println("hello:)");
	}

	public static int method2(int a, int b)
	{
		int sum = a + b;
		return sum;
	}
}