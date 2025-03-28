import java.util.Scanner;
class Ex7{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the number 1:");
		int number1=ob.nextInt();
		
		System.out.println("Enter the number 2:");
		int number2=ob.nextInt();
		
		for(int i=0; i<number1; i++)
		{
			System.out.println("value for i:"+i);
			
			for(int j=0; j<number2; j++)
			{
				System.out.println("value for j:"+j+" ");
			}
			System.out.println();
		}
	}
}
	
	
		