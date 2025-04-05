import java.util.Scanner;
class Ex3{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		char ch=' ';
		int countEven=0;
		int countOdd=0;
		int sumEven=0;
		int sumOdd=0;
		
		do
		{
			System.out.print("Enter the number to find the summation:");
			int n=ob.nextInt();
			System.out.print("Do you want to continue(Y/N): ");
			ch=ob.next().charAt(0);
		
			if(n%2==0)
			{
				countEven++;
				sumEven=sumEven+n;
			}
			else
			{
				countOdd++;
				sumOdd=sumOdd+n;
			}
		}
		while(ch=='Y'|| ch=='y');
		System.out.println("count the even number of user has enterd is:"+countEven);
		System.out.println("count the odd number of user has enterd is:"+countOdd);
		System.out.println("Summation the even number of user has enterd is:"+sumEven);
		System.out.println("Summation the odd number of user has enterd is:"+sumOdd);
	}
}
		
			

	