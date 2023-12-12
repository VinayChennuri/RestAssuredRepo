package OOPSConcepts;

public class ConstructorProgram {
	
	public ConstructorProgram()  // Non Parameterized constructor
	{
		System.out.println("Passes");
	}
	
	public ConstructorProgram(int a)
	{
		System.out.println("Number Passes");
	}

	public static void main(String[] args) {
		
		ConstructorProgram ob = new ConstructorProgram();
		ConstructorProgram obj1 = new ConstructorProgram(9);

	}

}
