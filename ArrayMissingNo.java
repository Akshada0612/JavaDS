
class ArrayMissingNo 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,4,5};
		int sum1=0;
		for (int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		System.out.println("Sum of array elements are:" + sum1);
		
		int sum2=0;
		for (int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of elements from 1 to 5 are:" + sum2);
		
		System.out.println("Missing element of an array is " + (sum2 - sum1));
		
	}
}
