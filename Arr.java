public class Arr
{
	public static void main(String[] args)
	{
		String[] arr = new String[4];
		String[] names = {"Mike", "Neil", "Susie", "George"};
		arr[0] = "Charles Da Man";
		System.out.println(arr[0]);
		int[] arr2 = new int[100];
		for(int i = 0; i < 100; i++)
		{
			arr2[i] = i;
			System.out.println(arr2[i]);
		}
		System.out.println(args[0]);
		System.out.println(get(arr2,50));
	}
	public static int get(int[] arr , int index)
	{
		return arr[index];
	}
}