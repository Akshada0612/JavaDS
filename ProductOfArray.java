//Product of array except self
class ProductExceptSelf  
{
	public static void main(String[] args) 
	{
		int[] arr={1,2,3,4};
		ProductExceptSelf(array);
	}
	public static void main(int [] array)
	{
		int n=array.length;
		for (int i=0;i<n;i++)
		{
			int product=1;
			for (int j=0;j<n;j++)
			{
				if (i!=j)
				{
					product*=array[j];
				}
			}
			System.out.println("Index"+i+"."+product);
		}
	}
}
