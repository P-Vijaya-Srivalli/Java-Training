import java.util.Scanner;
class LcmMethod
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int num1=sc.nextInt();
		int temp1=num1;
		int lcm;
		int num2=sc.nextInt();
		int temp2=num2;
		while(num2>0)
		{
			int rem=num1%num2;
			num1=num2;
			num2=rem;
		}
		//System.out.println(num1);
		lcm=(temp1*temp2)/num1;
		System.out.println(lcm);
	}
}
