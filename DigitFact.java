import java.util.Scanner;
class DigitFact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		while(num>0)
		{
			int ld=num%10;
			System.out.println("the factors of"+ld+":-");
			for(int i=1;i<=ld;i++)
			{
				if(ld%i==0)
				{
					System.out.println(i);
				}
			}
			num=num/10;
		}
	}
}
