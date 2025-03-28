import java.util.Scanner;
class Ex4
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter the letter:");
		char letter=ob.next().charAt(0);
		
		switch(letter)
		{
			case'a':
			case'A':
			case'e':
			case'E':
			case'i':
			case'o':
			case'O':
			case'u':
			case'U':
			System.out.println(letter+" is a vowel");
			break;
			default:System.out.println(letter+" is not a vowel");
		}
	}
}
		