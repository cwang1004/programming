public class Method
{		
	/*
		public vs private
		static vs nothing
		void is return type, void means return nothing
		main is the name of the function/method
		Inside parenthesis, are paremeters.
	*/
	public static void main(String[] args)
	{
		//printA();
		//sanic();
		System.out.println(add(1, 3)); 
		System.out.println(whatever("George", "Liu"));
	}

	public static void printA()
	{
		System.out.println("   * ");
		System.out.println("  * *   ");
		System.out.println(" *****  ");
		System.out.println(" *   *   ");
	}

	public static int sanic()//has to be static
	{
		//System.out.println("SaaAaAANNnNnnnnic");
		return 123456789;
	}

	public static int add(int sanicTheTissue, int toasterGun)
	{
		return sanicTheTissue + toasterGun;
	}

	public static String whatever(String spiderDonkey, String ironMonkey)
	{
		return spiderDonkey + ironMonkey;
	}
}