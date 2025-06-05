import java.util.Scanner;
class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int temp=num;
		int num1=num;
		int count=0;
		int sum=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		while(temp>0)
		{
			int expo=1;
			int ld=temp%10;
			for(int i=1;i<=count;i++)
				{
					expo=expo*ld;
				}
			sum=sum+expo;
			temp=temp/10;
		}
		//System.out.println(sum);
		if(sum==num1)
		{
			System.out.println(num1+" is an ARMSTRONG Number");
		}
		else
		{
			System.out.println(num1+ " is not an Armstrong Number");
		}
	}
}
