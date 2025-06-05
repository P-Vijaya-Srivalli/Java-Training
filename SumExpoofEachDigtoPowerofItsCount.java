import java.util.Scanner;
class  SumExpoofEachDigtoPowerofItsCount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
		int temp2=num;
		int sum=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		while(num>0)
		{
			int ld=num%10;
			int expo=1;
			for(int i=1;i<=count;i++)
			{
				expo=expo*ld;
			}
			sum=sum+expo;
			num=num/10;
		}
		System.out.println("Sum of Expoteial value sum"+temp2+" is:"+sum);
	}
}
