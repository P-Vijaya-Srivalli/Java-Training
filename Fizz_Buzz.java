//WAP a program FIZZ-BUZZ program
import java.util.Scanner;
class  Fizz_Buzz
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A number");
		int num=sc.nextInt();
		if(num%3==0 && num%5==0)
		{
			System.out.println(+num+"number is called aS FIZZ-BUZZ");
		}
		else if(num%3==0)
		{
			System.out.println(+num+"number is called as FIZZ");
		}
		else if(num%5==0)
		{
			System.out.println(+num+"number is called as BUZZ");
		}
		else
		{
			System.out.println(+num+"is not a FIZZ-BUZZ Number");
		}
	}
}
