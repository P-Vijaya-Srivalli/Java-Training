import java.util.Scanner
class PrintName 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Name");
		String name=sc.next();
		System.out.println("how many times to print");
		int t=sc.nextInt();
		int i=1;
		while(i<=t){
			System.out.println("name: "+name);
			i++;
		}
	}
}
