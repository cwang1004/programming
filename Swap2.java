public class Swap2
{
	public static void main (String[] args)
	{
		int a = 1;
		int b = 2;
		
		int c = a;//storing a into c. c=1
		
		a = b;//overwriting a with b. a=2
		b = c;//assigning b to c. b=1
		
		System.out.println(a);
		System.out.println(b);
	}
}
