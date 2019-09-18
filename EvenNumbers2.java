/*
	Great job!!! Very impressive. Nothing wrong with the logic here, just a few small things to change.
*/
public class EvenNumbers2
{
	public static void main(String[] args)
	{
		int cookies = 0;
		
		/*
			As a tradition in programming, 99% of the time we start the loop counter (a in your case) from 0.
			And as stated in the hw instruction, loop until a < 110. I think you misundertood.  :)
			Also, use '++' instead of '+=1'. Only use '+=' for numbers that are not 1.
		*/	
		/*
			Um, you mean to loop 110 times, Not to loop UNTIL 110...
			Right?

			PLS: I'll pull every day. Don't need to send a message to my mum.
			*/
		for(int a = 0; a < 110; a++)
		{
			System.out.println(cookies);
			cookies+=2;
		}
	}
}
