import java.util.Scanner;
class Array3{
	public static void main(String [] args)
	{
		Scanner op = new Scanner(System.in);
		int [] numbers =new int [5];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the number:");
			numbers[i] =op.nextInt();
			sum=sum+numbers[i];
		}
		System.out.print("Sum is "+sum);
	}
}