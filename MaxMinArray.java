class MaxMinArray 
{
	public static void main(String[] args) 
	{
		int arr[]={5,3,7,2,9};
		int size=arr.length;
		int max=arr[0];
		int min=arr[0];
		
		for (int i=1;i<=size-1;i++)
		{
			if (arr[i]>max)
			{
				max=arr[i];
			}else if (arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum element of the array is:"+ max);
			System.out.println("Minimum element of the array is:"+ min);
			
	}

}

