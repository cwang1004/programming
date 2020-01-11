import java.util.*;

public class Arr3
{
	public static void main(String[] args)
	{
	    int[] arr = new int[100];
	    for (int poop = 0; poop < 50; poop++)
	    {
	    	arr[poop] = poop;
	    	System.out.println(arr[poop]);
	    }
	    System.out.println(args[2]);
	    System.out.println(get(arr, 99));
	}
	public static int get(int[] arr,int index)
	{
		return arr[index];
	}
}