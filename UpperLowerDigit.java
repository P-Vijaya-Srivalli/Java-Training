//WAP to check wheater the given character is Lowercase Alphabet or Uppercase Alphabet or Digit or a Special char
import java.util.Scanner;
class  UpperLowerDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		char a=sc.next().charAt(0);
		if(a>='a' && a<='z')
		{
			System.out.println(+a+" is a Lower Case Alphabet");
		}
		else if(a>='A' &&a<='Z')
		{
			System.out.println(+a+" is a Upper Case Alphabet");
		}
		else if (a>='0' && a<='9')
		{
			System.out.println(+a+" is a Digit");
		}
		else
		{
			System.out.println(+a+" is a Special character");
		}
	}
}
