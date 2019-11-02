import java.util.*;
public class StudentProfile
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = input.nextLine();
		input = new Scanner(System.in);
		int gender = 0;
		while (gender > 2 || gender < 1)
		{
			System.out.println("What is your gender? 1-male, 2-female.");
			gender = input.nextInt();
		}
		Double height = 0.00;
		System.out.println("Enter your height in centimeters.");
		height = input.nextDouble();
		int age = 0;
		System.out.println("Enter your age.");
		age = input.nextInt();
		System.out.println("Name: " + name);
		if(gender == 1)
		{
			System.out.println("Gender: Male");
		}
		else
		{
			System.out.println("Gender: Female");
		}
		System.out.println("Height: " + height);
		System.out.println("Age: " + age);
		System.out.println("Creation Successfull!");
	}
}
/*
'-'
*/