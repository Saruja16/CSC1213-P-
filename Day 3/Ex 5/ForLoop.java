import java.util.Scanner;
class ForLoop{
	public static void main(String []args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number:");
	  int n = sc.nextInt();
	  
	  for(int i=0;i<=n;i++)
	  {
		  System.out.print(i+" ");
	  }
	}
}
	  