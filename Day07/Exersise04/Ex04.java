public class Ex04{
	static int findMax(int a,int b, int c)
	{
		if(a>=b && a>=c)
		{
			return a;
		}
		else if (b>=a && b>=c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static void main(String args[])
	{
		int max=findMax(15,2,15);
		System.out.println("max is:"+max);
	}
}
		
				