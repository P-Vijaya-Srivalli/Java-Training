import java.util.Scanner;
class LargestNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int a=sc.nextInt();
		int	b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a +" is Largest");
		}
		else{
			System.out.println(b +" is Largest");
		}
	}
}
