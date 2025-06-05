import java.util.Scanner;
class  DigitProg
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NUMber");
		int num=sc.nextInt();
		while(num>0)
		{
			int ld=num%10;
			System.out.println(ld);
			num=num/10;
		}
	}
}
