class Ex05{
	public static void main(String args[])
	{
		int values[][]={{54,2,45},{67,54,87},{76,46,89},{9,10,65}};
		
		for(int i=0; i<4;i++)
		{
			int max=values[i][0];
			
			for(int j=0; j<3; j++)
			{
				System.out.print(values[i][j]+" ");
				
				if (max<values[i][j])
				{
					max=values[i][j];
				}
			}
			System.out.println();
			System.out.println("max value is:"+max);
		
		}
	}
}