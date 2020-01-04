/*
1.foo will be 2
2.foo will be 2 again
3.foo will be 3 and bar will be 0
4.foo is 19 bar is 20
5.j is 6

6.each time not same
7.each time is not the same
8.it will be not boring
9.@$%@&**%&@$#!!$!&^%!$!^!%!!%@$%*
10.$%^%^#!$#&%^8_!*&$@#$&^%#%@@*%!
*/
import java.util.*;


public class Playground3
{
	public static void main(String[] args)
	{
		Random iii = new Random();
		int poop = iii.nextInt(90) + 11;
		int i = 0;
		while(i < 20)
		{
			System.out.println(poop);
			poop = iii.nextInt(90) + 11;
			i++;
		}
	}
}