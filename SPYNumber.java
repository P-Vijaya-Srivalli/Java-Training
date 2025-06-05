import java.util.Scanner;
class  SPYNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUmber");
		int num=sc.nextInt();
		int sum=0;
		int prod=1;
		int temp=num;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+ld;
			prod=prod*ld;
			num=num/10;
		}
		if(sum==prod)
		{
			System.out.println(temp+" is a SPY Number");
		}
		else
		{
			System.out.println(temp+" is not a SPY Number");
		}
	}
}
