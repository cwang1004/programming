import java.util.*;
public class StudentProfile2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String name = "";
		System.out.println("Enter your name");	
		name = input.nextLine();

		int age = 0;
		System.out.println("Enter your age");	
		age = input.nextInt();

		double height = 0.00;
		System.out.println("Enter your height(please use decimals, don't use whole numbers)");	
		height = input.nextDouble();

		int  gender = 0;
		while(gender < 1 || gender > 3)
		{
			System.out.println("Enter your gender--1 for male and 2 for female...... 3 for cookies ");	
			gender = input.nextInt();
		}

		String genderStr = "";
		if(gender == 1)
		{
			genderStr = "male";
		}
		else if (gender == 2)
		{	
			genderStr = "female";
		}
		else if (gender == 3)
		{
			genderStr = "cookie";
		}

		System.out.println("------Profile-----");
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Height:" + height);	
		System.out.println("Gender:" + genderStr);
		System.out.println("------------------");
	
	}
}