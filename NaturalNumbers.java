import java.util.Scanner;
class NaturalNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=1;
		System.out.println("how many Natural NUm");
		int n=sc.nextInt();

		while(i<=n)
			{
				System.out.println(i);
				i++;
			}
	}
}
