public class Swap
{
	public static void main(String[] args)
	{
		int a = 1;
		int b = 2;

		int c = a; //storing a into c. c=1

		a = b; //overwriting a with b. b=1
		b = c;//assigning c to b. b=1

		System.out.println(a);
		System.out.println(c);


	}
}