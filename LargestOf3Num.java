//WAP to find the largest of 3 numbers
import java.util.Scanner;
class  LargestOf3Num
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a>b &&a>c)
		{
			System.out.println(a+" is Largest");
		}
		else if(b>c)
		{
			System.out.println(b+" is Largest");
		}
		else
		{
			System.out.println(c+" is Largest");
		}
	}
}
