public class Arr2
{
	public static void main(String[] args)
	{
		String[] bah = new String[100];
		String[] names = {"George", "Susie", "Neil", "Mike"};
		int[] arr = new int[100];

		for(int i = 0; i < 100; i++)
		{
			arr[i] = i;
			System.out.println(arr[i]);
		}
		System.out.println(get(arr, 99));
	}

	public static int get(int[] arr, int index)
	{
		return arr[index];
	}
}