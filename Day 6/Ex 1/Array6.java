class Array6{
	public static void main(String [] args)
	{
		int Marks[][]=new int[2][2];
		Marks[0][0]=75;
		Marks[0][1]=85;
		Marks[1][0]=90;
		Marks[1][1]=95;
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(Marks[i][j]+" ");
			}
			System.out.println();
	}
}
}
		