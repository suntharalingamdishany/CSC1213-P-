import java.util.Scanner;
class Ex1
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter the number of find the sum:");
		int n=ob.nextInt();
		int i=0;
		int sum=0;
		
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.print("Summation of numbers from 0 to "+n+":"+sum);
	}
}
	