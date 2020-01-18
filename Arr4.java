public class Arr4
{
	public static void main(String[] args)
	{
		String [] arr= new String [4];//if you do not know what the array is 
		String [] names= {"George,Susie,Neil,Mike"};//if you have a idea of what the array is about
		arr[4];//the number of buckets is in the []
		System.out.println(arr[4]);
		int [] arr=new int [100];//creating a array of 100 buckets
		for (int i=0; <49; i++ );//start from 0 to 49
		{
			arr[i]=1//im not sure what is this part 
			System.out.println(arr[]);//print from 0 to 49
		}
		int[] neil=new int[10];//creating a array name Neil with 11 buckets( including 0)
		for (int you=0; you<10; you+=2 )//if "you" is less than 10 , then +2 to go to the next number ( starts from 0) 
		{
			neil[you] =you;//print the bucket's number .
		}
	}																																						
	public static int get(int[]arr,int index);//creating two type int ,name arr and index varieble 
	{
		return arr[index];//return information
		System.out.println(get);//print information
	}//the code under is similiar to flipping cards , so think on a different way
	public static int currentMax(int[] arr) //creating a public , static int varieble name currentMax. ( and a type int varieble name arr) 
	{
		int currentMax = arr[0];//the system now knew the first "card" so it think 0 is the biggest
		for(int i=1; i<arr.length;i++)// ( start from bucket 1 )if i is less than arr's length ( which means how many buckets ),keep "flipping the next card"
		{
			if(arr[i]>currentMax);//if "the card flipped just now" is more than the currentMax known before , ↓
			{
				currentMax = arr[i];//then make it the currentMax
			}
		}
		return currentMax;//store currentMax 
	}
	/*public static int currentMin(int[] arr)
	{
		int currentMin = arr[0];
		for(int a=1; i<arr.length;i++)
		{
			if(arr[i]>)
		}
	}
	*/
	//unfinished program 
		
} 