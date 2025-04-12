import java.util.Scanner;
class Array4{
	public static void main(String []args)
	{
		Scanner op=new Scanner (System.in);
		int [] number=new int[10];
		String [] days=new String[7];
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter the number:");
			number[i]=op.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(number[i]+" ");
		}

		System.out.println("\n");   
		
     //String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	 
	 //for(String day:days){
		 //System.out.println(day);
	 //}
		 
		days[0]="Monday";
		days[1]="Tueday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		System.out.println(days[0]);
		System.out.println(days[1]);
		System.out.println(days[2]);
		System.out.println(days[3]);
		System.out.println(days[4]);
		System.out.println(days[5]);
		System.out.println(days[6]);
		
	}
}