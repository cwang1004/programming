public class Method3
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
		System.out.println(add(1, 3));
		System.out.println(aCold("Susie","Wang"));
	}

	public static int add(int george, int tissue)
	{
		return george + tissue;
	}

	public static String aCold(String cookie, String milkshake)
	{
		return cookie+milkshake;
	}
}