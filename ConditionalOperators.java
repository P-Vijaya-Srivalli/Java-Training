import java.util.Scanner;
class ConditionalOperators 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Num");
		int num=sc.nextInt();
		if(num>10&&num<25)
		{
			System.out.println(num+" is Greater than 10 and Lesser than 25");
		}
		else
			{
			System.out.println(num+" is  Not Greater than 10 and Lesser than 25");
			}
	}
}
