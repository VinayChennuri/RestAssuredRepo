package OOPSConcepts;

public class Abstraction2 extends Abstraction1 {
	
	public static void section()
	{
		System.out.println("Section: A");
	}
	
	public static void name()
	{
		System.out.println("Name: Ram");
	}
	
	public static void main(String[] args) {
		
		Abstraction2 ob = new Abstraction2();
		ob.ranks();
		ob.marks();
		ob.section();
		ob.name();
		

}

	@Override
	void ranks() {
     System.out.println("Rank: 1");
	}

	@Override
	void marks() {
    System.out.println("Marks: 990");		
	}
}
