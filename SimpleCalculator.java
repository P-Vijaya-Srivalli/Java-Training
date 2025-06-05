//WAP to perform simple calculator
import java.util.Scanner;
class  SimpleCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the type of operation");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.DIvision");
		System.out.println("5.Modulus");
		int option=sc.nextInt();
		switch(option)
		{
			case 1 :
			{
				System.out.println("Enter the first Number");
				double num1=sc.nextDouble();
				System.out.println("Enter the Second number");
				double num2=sc.nextDouble();
				double Result=num1+num2;
				System.out.println("RESULT:"+Result);
			}break;
			case 2:
			{
				System.out.println("Enter the first Number");
				double num1=sc.nextDouble();
				System.out.println("Enter the Second number");
				double num2=sc.nextDouble();
				double Result=num1-num2;
				System.out.println("RESULT:"+Result);
			}break;
			case 3:
			{
				System.out.println("Enter the first Number");
				double num1=sc.nextDouble();
				System.out.println("Enter the Second number");
				double num2=sc.nextDouble();
				double Result=num1*num2;
				System.out.println("RESULT:"+Result);
			}break;
			case 4:
			{
				System.out.println("Enter the first Number");
				double num1=sc.nextDouble();
				System.out.println("Enter the Second number");
				double num2=sc.nextDouble();
				double Result=num1/num2;
				System.out.println("RESULT:"+Result);
			}break;
			case 5 :
			{
				System.out.println("Enter the first Number");
				double num1=sc.nextDouble();
				System.out.println("Enter the Second number");
				double num2=sc.nextDouble();
				double Result=num1%num2;
				System.out.println("RESULT:"+Result);
			}break;
			default:System.out.println("Invalid Option");
		}


	}
}
