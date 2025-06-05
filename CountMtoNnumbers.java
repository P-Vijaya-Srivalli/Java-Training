/*class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}*/
import java.util.Scanner;
class  CountMtoNnumbers
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of M and N");
		int m=sc.nextInt(),n=sc.nextInt();
		int count=0;
		for(int i=m;i<=n;i++)
		{
			count++;
		}
		System.out.println("the total numbers between M and N are: "+count);
	}
}

