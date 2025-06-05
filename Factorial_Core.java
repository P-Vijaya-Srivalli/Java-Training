/*class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}*/
import java.util.Scanner;
class  Factorial_Core
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num value");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("the Factorial of the given number is :"+fact);
	}
}
