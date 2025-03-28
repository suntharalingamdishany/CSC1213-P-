import java.util.Scanner;
class Ex5
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=ob.nextInt();
		
		for(int i=1; i<number; i++)
		{
			System.out.println(i+" \t");
		}
	}
}