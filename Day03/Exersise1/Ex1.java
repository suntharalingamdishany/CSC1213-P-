import java.util.Scanner;
class Ex1{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int number=ob.nextInt();
		
		if(number>0)
		{
			System.out.println(number+" is positive");
		}
		else if(number<0)
		{
			System.out.println( number +"is negative");
		}
		
		else
		{
			System.out.println(number+"The number is zero");
		}
	}
}
		
		