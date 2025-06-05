import java.util.Scanner;
class FindingAnElementInAnArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter of Size of ana Array");
		int size=sc.nextInt();
		int[] a=new int[size];
		boolean isPresent=false;
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter the "+i+" element value: ");
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element to search");
		int search=sc.nextInt();
		for(int i=0;i<=a.length-1;i++)
		{
			if(search==a[i])
			{
				System.out.println("Element is Found");
			}
			else
			{
				System.out.println("element is not found");
			}
		}
		
	}
}
