import java.util.Scanner;
public class Ex01
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int numbers[]=new int[5];
		int sum=0;
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter the element:");
			numbers[i]=sc.nextInt();
			sum=sum+numbers[i];
		}
		System.out.println("Sum is:"+sum);
	}
}