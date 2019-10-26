//neil's homrwork!!!!!!!!!!!!!

//{[()]}\\

import java.util.*;

public class StudentPorfile3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your username"); //promt
		String name = input.nextLine();

		System.out.println("enter your age");
		int age = input.nextInt();

		int gender = 0;
		while(gender < 1 || gender > 2)
		{
			System.out.println("Enter you gender: 1 - male, 2 - female");
			gender = input.nextInt();
		}

		System.out.println("enter your height");
		double height = input.nextDouble();
		System.out.println("");
		System.out.println("loading...");
		System.out.println("");
		System.out.println("name: "+ name);
		System.out.println("age: "+ age );
		if(gender == 1)
		{
			System.out.println("gender: male");
		}
		else
		{
			System.out.println("gender: female");
		}		
		System.out.println("height: "+ height);
	}
}