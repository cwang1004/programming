import java.util.*;

public class CatchUp3
{
	public static void main(String[] args)
	{
		String name = "neil";
	    int a = 9;
	    double height = 1.45;
	    System.out.println("hello");
	    System.out.println(name);
	    System.out.println("1" + "2");
	    System.out.println("age: " + a);
	    System.out.print("height: " + height + "\n");
	    System.out.print(" is short!!! " + "\n");
	    printName();
	    int count = 0;
	    while(count < 20 )
	    {
	    	printName();
	    	count ++;
	    }
	}

	public static void printName()
	{
		System.out.println("neil");
		System.out.println("neil");
	} 
}