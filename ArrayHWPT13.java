import java.util.*;

public class ArrayHWPT1
{
	public static void main(String[] args)
	{
		String[] classMate = {"susie","neil","mike","george"};
		String[] favMovies = {"john cena","iorn man","007","john cena"};
		for(int i = 3; i > -1; i--)
		{
			System.out.println(classMate[i] + "'s favorite movie is " + favMovies[i]);
		}
		int[] a = {1,2,3};
		subtractForm(10,a);

	}
	public static int sum(int[] arr)
	{
		int a = 0;
		for(int i=0;i<arr.length;i++)
		{
			a+=arr[i];
		}
		System.out.println(a);
		return a;     
	}
	public static int subtractForm(int target, int[] numbers)
	{
		
		for(int i=0;i<numbers.length;i++)
		{
			target-=numbers[i];
		}
		System.out.println(target);
		return target;
	} 
}
//why my favorite movie is johncena... --Susie