class ReverseArray 
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5};
		int size=arr.length;
		System.out.println("Given array elements are:");
		for (int i=0;i<=size-1;i++ )
		{
		System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Reverse elements of array are:");
		for (int i=size-1;i>=0;i-- )
		{
			System.out.print(arr[i] + " ");
		}
	}
}
