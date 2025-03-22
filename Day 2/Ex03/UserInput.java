import java.util.Scanner;
class UserInput{
	
public static void main(String args[]){
	
String firstname;

Scanner sc = new Scanner(System.in);

System.out.println("Enter your firstname:");

firstname = sc.nextLine();

System.out.print("Enter your lastname:");

String lastname = sc.next();

System.out.println("Enter your marks:");

int marks = sc.nextInt();

System.out.println("Full name:"+firstname+" "+lastname+"\n"+"Marks is "+marks);
}
}
