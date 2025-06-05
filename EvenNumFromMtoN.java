import java.util.Scanner;
class  EvenNumFromMtoN
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of M and N");
		int M=sc.nextInt();
		int N=sc.nextInt();
		for(int i=M;i<=N;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
``