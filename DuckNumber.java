import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int count=0;
		int temp=num;
			while(temp>0)
			{
				int ld=temp%10;
				if(ld==0)
				{
					count++;
				}
				temp=temp/10;
			}
			if(count>0)
			{
				System.out.println(num+" is a DUCK NUMBER");
			}
			else
			{
				System.out.println(num+ " is not a DUCK NUMBER");
			}
			
	}
}
