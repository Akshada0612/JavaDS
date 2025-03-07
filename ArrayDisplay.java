import java.util.Scanner;
class ArrayDisplay 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of an array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
			for (int i=0;i<size ;i++ )
			{
			a[i]=sc.nextInt();
			}
			for (int i=0;i<size;i++ )
			{
			System.out.print(a[i] + " ");
			}
	}
}
