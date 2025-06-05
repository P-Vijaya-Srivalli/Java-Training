//WAP to check Wheater the given number is divisible by 3 or not
import java.util.Scanner;
class  DivisibleBYThree
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num%3==0)
		{
			System.out.println("Entered Number is Divisible by 3");
		}
		else
		{
			System.out.println("Entered Number is Not Divisible by 3");
		}

	}
}
