class Array10{
	public static void main(String args[])
	{
		
		int value[][]={{54,2,45},{67,54,87},{76,46,89},{9,10,65}};
		
		for(int i=0;i<4;i++)
		{
			 int max=value[i][0];
			for(int j=0;j<3;j++)
			{
				if (value[i][j]>max)
				{
				max=value[i][j];
				}
			}
			
		System.out.print("maximum is "+max);
		System.out.print("\n");
		}
}}