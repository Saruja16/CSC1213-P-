import java.util.Scanner;
class StudentDetails{
	public static void main(String []args)
	{
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your name:");
	String Name=sc.next();
	
	System.out.print("Enter your age:");
	int Age=sc.nextInt();
	
	System.out.print("Enter your registration number:");
	String RegNo=sc.next();
	
	System.out.print("Enter your sex(M/F):");
	char Sex=sc.next().charAt(0);
	
	System.out.print("Enter your mobile number:");
	long PhoneNo=sc.nextLong();
	
	System.out.print("Enter your GPA:");
	double GPA=sc.nextDouble();
	
	System.out.print("Name:"+Name+"\n"+"Age:"+Age+"\n"+"Registration number:"+RegNo+"\n"+"Mobile number"+PhoneNo+"\n"+"GPA:"+GPA);
	}
}