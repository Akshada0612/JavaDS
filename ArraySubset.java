class ArraySubset
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3};

        boolean result = true;
        for (int j : arr2)
        {
            boolean found = false;
            for (int i : arr1)
            {
                if (i == j)
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                result = false;
                break;
            }
        }
        String check_subset = result ? "Yes, it is a subset of the given array" : "No, it is not a subset";
        System.out.println(check_subset);
    }
}
