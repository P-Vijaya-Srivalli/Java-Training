import java.util.Scanner;
class CharMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		System.out.println("enter the index value");
		int i=sc.nextInt();
		char ch=s.charAt(i);
		System.out.println("the character present at "+i+" is :-"+ch); 
	}
}
