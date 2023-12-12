package JavaPrograms;

public class LoopsTest {

	public static void main(String[] args) {
		
		for (int i=0;i<=5;i++) {     // Pyramid Model
		for (int j=0;j<=i;j++) {
			
			System.out.print("*");
			
		}
		System.out.println();
		}

		int num[] = {10,20,30,40,50};
		for(int k:num)
		{
			System.out.println(k);
		}
	}

}
