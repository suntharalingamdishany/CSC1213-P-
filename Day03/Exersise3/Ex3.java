import java.util.Scanner;
class Ex3
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Input the number:");
		int day=ob.nextInt();
		
		switch(day)
		{
			case 1: System.out.println("It is monday");
			break;
			case 2: System.out.println("It is tuesday");
			break;
			case 3: System.out.println("It is wednesday");
			break;
			case 4: System.out.println("It is thursday");
			break;
			case 5: System.out.println("It is friday");
			break;
			case 6: System.out.println("It is saturday");
			break;
			case 7: System.out.println("It is sunday");
			break;
			default: System.out.println("Invalid");
		}
	}
}

			
	