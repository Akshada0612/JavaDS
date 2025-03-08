//Move all zeros to end of an array
public class MoveZerosToEnd
	{
    public static void main(String[] args)
		{
         int[] arr = {0, 1, 2, 0, 3, 0, 4, 5};
         int index = 0;
         for (int i = 0; i < arr.length; i++)
			 {
                if (arr[i] != 0)
				{
                arr[index] = arr[i];  
                if (index != i)
				{      
                    arr[i] = 0;        
                }
                index++;  
            }
        }
        System.out.println("Array after moving zeros to the end:");
        for (int num : arr)
		{
            System.out.print(num + " ");
        }
    }
}
