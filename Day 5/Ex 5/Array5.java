import java.util.Scanner;
class Array5{
	public static void main(String [] args)
	{
		Scanner ac = new Scanner(System.in);
		int []numbers = new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the number:");
			numbers[i] = ac.nextInt();
		}
		System.out.println("\n");
		
		int max=numbers[0];
	    int min=numbers[0];
		for(int i=1;i<5;i++)
		{
		if(numbers[i]>max)
		{
			max=numbers[i];
		}
		if(numbers[i]<min)
		{
			min=numbers[i];
		}
		}
		System.out.println("Maximum is"+max);
		System.out.println("Minimum is"+min);
	}
}