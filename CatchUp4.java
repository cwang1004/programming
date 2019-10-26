public class CatchUp4
{
	public static void main(String[] args)
	{
		String name = "mike";
		int a = 9;
		double height = 0.1;
		System.out.println("hello");
		System.out.println(name);
		System.out.println("1"+"2");
		System.out.println("Age: "+a);
		System.out.print("height: "+height+"\n");
		System.out.print("is short"+"\n");
		printName();
		int count = 0;
		while(count<20)
		{
			printName();
			count++;
		}
	}

	public static void printName()
	{
		System.out.println("mike");
		System.out.println("mike");
	}
}	