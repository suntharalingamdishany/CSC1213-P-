import java.util.Scanner;
class Ex2{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the number 1:");
		int n1=ob.nextInt();
		
		System.out.println("Enter the number 2:");
		int n2=ob.nextInt();
		
		System.out.println("Enter the number 3:");
		int n3=ob.nextInt();
		
		if((n1>n2) && (n2>n3))
		{
			System.out.println(n1+" is maximum");
		}
		else if ((n2>n1) && (n1>n3))
		{
			System.out.println(n2+" is maximum");
		}
		else
		{
			System.out.println(n3+" is maximum");
		}
	}
}
		