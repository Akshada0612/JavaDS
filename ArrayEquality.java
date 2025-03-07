import java.util.Arrays;
class ArrayEquality 
	{
    public static void main(String[] args)
		{
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        boolean status = Arrays.equals(arr1, arr2);

        if (status) 
		{
            System.out.println("Both arrays are equal");
        } 
		else
		{
            System.out.println("Both arrays are not equal");
        }
    }
}
