import java.util.Scanner;
class Hcf 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int hcf=0;
		int end=0;
		if(num1<=num2)
		{
			end=num1;
		}
		else
		{
			end=num2;
		}
		for(int i=1;i<=end;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				hcf=i;
			}
			//System.out.println("the hcf of given"+num1 +"and"+num2+"is :- "+hcf);
		}
		System.out.println("the hcf of given"+num1 +" and"+ num2+"is :- "+hcf );
	}
}








                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          