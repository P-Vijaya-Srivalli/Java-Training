import java.util.Scanner;
class  ExpoentialValue
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x=sc.nextInt();
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int expo=1;
		for(int i=1;i<=n;i++)
		{
			expo=expo*x;
		}
		System.out.println("The expoential value of x to the power of n is :"+expo);
	}
}
