import java.util.Scanner;
class SumMtoN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of m and n");
		int m=sc.nextInt(),n=sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("the sum of num's between M and N are: "+sum);
	}
}
