class ex2{
	public static void main(String[] args)
	{
		String Name,Address,DOB,Sex;
		int Age;
		Name=args[0];
		Address=args[1];
		DOB=args[2];
		Sex=args[3];
		Age=Integer.parseInt(args[4]);
		
		int a=10;
		int b=a+Age;
		
		System.out.println("name:"+Name+"\n"+"Address:"+Address+"\n"+"Date of Birth:"+DOB+"\n"+"Sex:"+Sex+"\n"+"Age:"+Age);
		System.out.println("Age is: "+b);
	}
}