import java.util.Scanner;
class ex3{
	public static void main(String[] args)
	{
		String fname;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter your First name:");
		fname=sc.nextLine();
		
		System.out.println("Enter your last name:");
		String lname=sc.next();
		
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		System.out.println("Enter Registration number:");
		String Regno=sc.next();
		
		System.out.println("Sex (f/m):" );
		char sex=sc.next().charAt(0);
		
		System.out.println("Enter your mobile number:");
		long mob=sc.nextLong();
		
		System.out.println("Enter your GPA:");
		double gpa=sc.nextDouble();
		
		System.out.println();
		System.out.println("Full name:"+fname+" "+lname+"\n"+"Age is:"+age+"\n"+"Reg number:"+Regno+"\n"+"Sex:"+sex+"\n"+"Mobile Number:"+"\n"+mob+"\n"+"GPA is:"+gpa);
	}
}
		
		
		
		