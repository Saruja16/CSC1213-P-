import java.util.Scanner;
class Ex10{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number1:");
		int number1 = sc.nextInt();
		
		System.out.print("Enter number2:");
		int number2 = sc.nextInt();
		
		//check the maximum number
		if(number1>number2)
		{
			System.out.println("number1 is maximum");
		}
		else
		{
		System.out.println("number2 is maximum");
		}
	}
}