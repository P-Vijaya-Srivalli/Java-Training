import java.util.Scanner;
class PrintExtreme&Mean 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int num=sc.nextInt();
		int temp=num;
		int lastDigit=num%10;
		int num=num/10;
			while(num>=10)
			{
				int ld = ld%10;
				System.out.println(ld);
				num=num/10;
			}
			System.out.println("the Extreme Digits in " +temp +"are:- " +ld);
			System.out.println(num);
			System.out.print(lastDigit);
	}
}

