import java.util.Scanner;
class Positive 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int a=sc.nextInt();
		if(a>=0)
			{
			System.out.println("Entered  number is positive");
			}
		else
			{
			System.out.println("Entered number is not postivie");
			}
	}
}
