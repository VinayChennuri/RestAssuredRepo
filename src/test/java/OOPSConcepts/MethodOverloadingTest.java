package OOPSConcepts;

public class MethodOverloadingTest {
	
	public static void main()  // without return type and without parameters
	{
		System.out.println("Print 1");
	}
	
	public static void main(int a)  // without return type and with parameters
	{
		System.out.println(a);
	}
	
	public static String name(String b)  // with return type and with parameters
	{
		return b;
	}
	
	public static int rank(int v)
	{
		return v; 
	}

	public static void main(String[] args) {
		
		main();
		main(10);
		System.out.println(name("vinay"));
		System.out.println(rank(20));

	}

}
