public class Ex05{
	static int sum(int a,int b)
	{
		return a+b;
	}
	static double sum(double a, double b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		int intresult=sum(4,5);
		double doubleresult=sum(3.5,5.5);
		
		System.out.println("Sum(int):"+intresult);
		System.out.println("Sum(double):"+doubleresult);
	}
}
		