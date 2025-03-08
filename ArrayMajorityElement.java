class ArrayMajorityElement 
	{
    public static void main(String[] args)
		{
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int majorityElement = findMajorityElement(arr);
        if (majorityElement == -1)
		{
            System.out.println("No majority element");
        } else {
            System.out.println("Majority element: " + majorityElement);
        }
    }
    public static int findMajorityElement(int[] arr)
		{
        int n = arr.length;
        int majorityCount = n / 2;  
        for (int i = 0; i < arr.length; i++)
			{
            int count = 0; 
            for (int j = 0; j < arr.length; j++)
				{
                if (arr[j] == arr[i])
				{
                    count++;
                }
            }
            if (count > majorityCount)
			{
                return arr[i];
            }
        }
        return -1;
    }
}
