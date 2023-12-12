package OOPSConcepts;

public class MethodOverridingTest {
	
	public void prog1()
	{
		System.out.println("Program 1 Successfully launched");
	}
}

 class MOT2 extends MethodOverridingTest
{
	public void prog2()
	{
		System.out.println("Program 2 Successfully launched");
	}

 
	public static void main(String[] args) {
		
     MOT2 ob = new MOT2();
     ob.prog1();
     ob.prog2();
	}

}


