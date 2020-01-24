/*
An Array is both a data type and a data structure.
You don't have to write a million lines of code.
*/
public class ArrayHWPT1
{
	public static void main(String[] args)
	{
		String[] classmates = {"Jerry the Mouse", "The Cookie Monster", "Spongebob"};
		String[] favMovies = {"Cheesewiz", "The Invasion of the Cookies", "Spongeworld"};
		for(int i = 0; i < 3; i++)
		{
			System.out.println(classmates[i] + "'s favorite movie is " + favMovies[i]);
		}
		System.out.println("------------------------------------------");
		for(int a = 2; a > -1; a--)
		{
			System.out.println(classmates[a] + "'s favorite movie is " + favMovies[a]);
		}
		int[] b = {1, 2, 8, 92, -33};
		System.out.println(sum(b));
	}
	public static int sum(int[] arr)
	{
		int sums = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sums += arr[i];
		}
		System.out.println(sums);
		return sums;
	}
}