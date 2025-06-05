import java.util.Scanner;
class  Empolyee_details
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the empolyee");
		String name=sc.next();
		System.out.println("ENter the company name of the empoyee");
		String company=sc.next();
		System.out.println("Enter the age of the empolyee");
		int age=sc.nextInt();
		System.out.println("Enter the salary of the empolyee");
		int salary=sc.nextInt();
		System.out.println("Enter the empolyee_Id");
		int empolyee_id=sc.nextInt();
		System .out.println("Enter the gender of the empolyee");
		char gender=sc.next().charAt(0);
		System.out.println("Name: "+name); 
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Comapny Name: "+company);
		System.out.println("Salary: "+salary);
		System.out.println("Empolyee_Id: "+empolyee_id);
	}
}
