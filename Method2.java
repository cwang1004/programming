public class Method2
{
	/*
		cookie milkshake
		public vs private
		static vs nothing
		void is return type(int, String, etc.)Void means return nothing.
		main is the name of the function/method
		Inside parenthesis, are parameter(String args).
	*/
	public static void main(String[] args)
	{
		System.out.println(cookies());
		System.out.println(add());
	}

	public static void printA()
	{
		System.out.println("    **********");
		System.out.println("   *          *");
		System.out.println("  *            *");
		System.out.println(" *              *");
		System.out.println("*                *");
		System.out.println("*******************");
		System.out.println("*                 *");
		System.out.println("*     stands      *");
		System.out.println("*    awesome!     *");
		System.out.println("*                 *");
		System.out.println("*                 *");
	}

	public static int cookies()
	{
		return 123;
	}

	public static int add(int a, int b)
	{
		return a + b;
	}
}