//WAP for Switch Case
import java.util.Scanner;
class  SwitchCase
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Expression value");
		int say=sc.nextInt();

		switch(say)
		{
			case 1 :
				System.out.println("Case1");
			break;
			case 2 :{
				System.out.println("Case2");
			}
			break;
			case 3 :System.out.println("Case3");break;
			case 4 :System.out.println("Case4");break;
			case 5 :System.out.println("Case5");break;
			case 6 :System.out.println("Case6");break;
			default :System.out.println("default");
		}
	}
}
