import java.util.Scanner;
class  MtoNnumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M and N");
		int m=sc.nextInt(),n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
