class LinearSearch 
{
    public static void main(String[] args) 
    {
        int [] arr = {24, 56, 30, 50, 60};
        int search_ele = 56;
        for (int i = 0; i < arr.length; i++) 
        {
            if (search_ele == arr[i]) 
            {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }
}
