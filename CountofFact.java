import java.util.Scanner;
class  CountofFact
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Number");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
		}
		System.out.println("the count of the factorials of the given Number is : " +count);
	}
}
