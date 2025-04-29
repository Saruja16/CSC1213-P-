class Array9{
	public static void main(String args[])
	{
		
		int value[][]={{98,12,34,32},{45,54,67,45},{13,14,89,87}};
		

		for(int i=0;i<3;i++)
		{
			
			int sum=0;
			for(int j=0;j<4;j++)
			{
				sum=sum+value[i][j];
			}
			System.out.print("Number "+(i+1)+" student total mark is "+sum+"\n");
		}
		
		System.out.println();
}}