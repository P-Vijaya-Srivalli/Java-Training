import java.util.Scanner;
class SumofEven&OddDigitsInAGivenNUM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(system.in);
		System.out.println("Enter the NUmber");
		int num=sc.nextInt();
		int sumEO=0
		while(num>0)
		{
			int ld=num%10;
			if(ld%2==0)
			{
				int sum=0;
				sum=sum+ld;
			}
			else
			{
				int sum1=0;
				sum1=sum1+ld;
			}
			sumEO=sum+sum1;
			System.out.println(sumEO);
	}
}
