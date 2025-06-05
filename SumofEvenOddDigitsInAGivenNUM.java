import java.util.Scanner;
class SumofEvenOddDigitsInAGivenNUM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int num=sc.nextInt();
		int sumEO=0;
		int sum=0;
		int sum1=0;
		while(num>0)
		{
			int ld=num%10;
			//System.out.println("the Even numbers Are: ");
			if(ld%2==0)
			{
				System.out.println("the Even numbers Are: " +ld);
				sum=sum+ld;
			}
			//System.out.println("the odd NUmbers are : ");
			else
			{
				System.out.println("the odd NUmbers are : "+ld);
				sum1=sum1+ld;
			}
			num=num/10;
		
		}
		System.out.println(" the sum of even number and odd numbers is :- ");
			sumEO=sum+sum1;
			System.out.println(sumEO);
	}
}
