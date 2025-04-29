class Array8{
	public static void main(String []args)
	{
		int value[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		int sum=0;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(value[i][j]+" ");
				sum=sum+value[i][j];
			}
			System.out.println();
		}
		System.out.print("\n");
			
		
		System.out.print("Sum is "+sum);
}}