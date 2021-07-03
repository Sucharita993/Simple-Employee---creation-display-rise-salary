import java.util.Scanner;
class Employee
{
	public static void main(String[] args)
	{
	int i=0,age=0,salary=0;
	String name="",designation="";
	Scanner sc = new Scanner(System.in);
	do{
	System.out.println("1.Create\n2.Display\n3.Salary Increment\n4.Exit");
	System.out.println("Enter the number:");
	i = sc.nextInt();
	switch(i)
	{
		case 1: 
		System.out.println("Enter the name:");
		name = sc.next();
		System.out.println("Enter the age:");
		age = sc.nextInt();
		System.out.println("Salary is:");
		salary = sc.nextInt();
		System.out.println("Designation is :");
		designation = sc.next();
		System.out.print("\n");
		break;

		case 2:
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Salary :" + salary);
		System.out.println("Designation :" + designation);
		System.out.print("\n");
		break;

		case 3:
		salary = salary + 1000;
		System.out.println("Salary is rised");
		System.out.print("\n");
		break;
		
		case 4:
		break;
		
		default:
		break;
	}
	}while(i>0 && i<4);
	sc.close();
	}
}