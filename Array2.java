public class Array2
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int i = 0;

		while(i < 10)
		{
			System.out.println(arr[i]);
			i++;
		}

		i = 0;
		double[] arr2 = new double[10];

		while(i < 10)//double arr
		{
			System.out.println(arr2[i]);
			i++;
		}

		i = 0;
		int[] arr3 = new int[100];
		int[] arr4 = new int[100];
		int[] arr5 = new int[100];
		while(i < 100)
		{
			arr3[i] = i+1;

			arr4[i] = i - 6;
			//System.out.println(arr3[i]);
			//System.out.println(arr4[i]);
			arr5[i] = arr3[i] + arr4[i];
			System.out.println(arr5[i]);

			i++;

		}
	}
}
//hw: make a arr5 with 100 buckets, the 1