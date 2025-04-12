import java.util.Scanner;
public class Array2{
	public static void main(String []args)
	{
		int[] numbers = new int[5];
		
		Scanner op = new Scanner(System.in);
		System.out.print("Enter the number1:");
	    numbers[0]=op.nextInt();
		System.out.print("Enter the number2:");
		numbers[1]=op.nextInt();
		System.out.print("Enter the number3:");
		numbers[2]=op.nextInt();
		System.out.print("Enter the number4:");
		numbers[3]=op.nextInt();
		System.out.print("Enter the number5:");
		numbers[4]=op.nextInt();
		
		
	System.out.println("Sum of  the numbers:"+(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]));

	}
}
		
		
		