public class Person2
{
	public static void main(String[] args)
	{
		String name = "Susie";
		int age = 11;
		double height = 1.43;

		System.out.println("My name is " + name + ", and i am " + age + " years old. I am " + height + " meters tall.");

		int a = 0;
		int b = 0;
		int c = 0;

		a += 5;
		b = -4;
		// b -= 4;
		
		c++;
		c++;
		c++;
		// a = 5 b = -4 c = 3

		a += b;
		// a = 1
		b *= c;
		// b = -12
		a = b
		c = a + b;
		// c = 16 a = -12

		int i = 1;

		while(i <= 100)
		{
			System.out.println(name);
			i++;
		}
	}
}