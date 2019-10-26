//neil's homrwork!!!!!!!!!!!!!



import java.util.*;

public class StudentPorfile3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter your username"); //promt
		String name = input.nextstring();

		System.out.println("enter your age");
		int age = input.nextint();
		System.out.println("enter your gender 1-male 2-female");
		int gender = input.nextInt();
		while(gender < 1 || > 2)
		{
			if(gender == 1 )
			gender = input.nextdouble();
			else 
			gender = input.nextdouble();
		}
		System.out.println("enter your hight");
		String hight = input.nextstring();
		System.out.println("loading");
		System.out.println("name,age,gender,hight");
	}
}