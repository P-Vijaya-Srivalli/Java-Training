import java.util.Scanner;
class  PerfectSquareNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			if(i*i==num)
			{
				System.out.println(num+ " is a PERFECT SQUARE NUMBER");
				break;
			}
			else if(i*i>num)
			{
				System.out.println(num +" is not a PERFECT SQUARE NUMBER");
				break;
			}
		}
	}
}
