import java.util.Scanner;
class Array11{
	public static void main(String []args)
	{
	 Scanner sc =new Scanner(System.in);
	 
	 System.out.print("Enter the size of row:");
	 int x=sc.nextInt();
	  System.out.print("Enter the size of column:");
	 int y=sc.nextInt();
	 
	 int numbers[][]=new int[x][y];
	 for(int i=0;i<x;i++)
	 {
		 for(int j=0;j<y;j++)
		 {
			 System.out.print("Enter the numbers");
		 numbers[i][j]=sc.nextInt();
		 }
	 }
	 int sum=0;
	
	 for(int i=0;i<x;i++)
	 {
		 for(int j=0;j<y;j++)
		 {
			 sum=sum+numbers[i][j];
		 }
	 }
	 System.out.print("Sum is "+sum);
	 System.out.println();
	 
	 int maximum=numbers[0][0];
	 for(int i=0;i<x;i++)
	 {
		 for(int j=0;j<y;j++)
		 {
               if (numbers[i][j]>maximum)
				{
				maximum=numbers[i][j];
				}
			}
		}
		System.out.print("maximum is"+maximum);
}
		}
		
			 