import java.util.Scanner;
class Ex13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number1:");
		int number1=sc.nextInt();
		
		System.out.print("Enter the number2:");
		int number2=sc.nextInt();
		
		if(number1>number2)
		{
		System.out.print(number1+" is maximum");	
		}
		else
		{
			System.out.print(number2+" is maximum");
		}
	}
}	
		
		