class ArrayFreqOfEle 
{
	public static void main(String[] args) 
	{
		int []arr={1,2,3,1,3,4};
		
		for (int i=0;i<arr.length;i++)
		{
			int count=0;
			for (int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println("Number: "+ arr[i] + " Frequency "+ count);
		}
		
	}
}
