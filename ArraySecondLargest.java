class ArraySecondLargest
	{
    public static void main(String[] args)
		{
        int[] arr = {3,5,6,1,3};
        
        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
			{
            if (arr[i] > largest)
			{
                secondLargest = largest;
                largest = arr[i];
            }
           
            else if (arr[i] > secondLargest && arr[i] != largest)
			{
                secondLargest = arr[i];
            }
        }

        
        if (secondLargest != Integer.MIN_VALUE)
		{
            System.out.println("The second largest element is: " + secondLargest);
        } else
		{
            System.out.println("There is no second largest element.");
        }
    }
}
