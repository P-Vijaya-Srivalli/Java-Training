import java.util.Scanner;
class Eucledian(hcf) 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		while(num2>0)
		{
			int rem=num1%num2;
			num1=num2;
			num2=rem;
		}
		System.out.println(num1);
	}
}
