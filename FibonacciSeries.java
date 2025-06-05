import java.util.Scanner;
class  FibonacciSeries
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range value of Fibonacci Series");
		int num=sc.nextInt();
		int a=0,b=1,c;
		for(int i=1;i<=num;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
