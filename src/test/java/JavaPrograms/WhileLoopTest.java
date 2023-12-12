package JavaPrograms;
import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) {
		
		// While Loop
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int i = sc.nextInt();
		
		while(i<=100)
		{
			System.out.print(i+" ");
			i++;
		}

		System.out.println();
		System.out.print("Enter Number :");
		int j = sc.nextInt();
		do
		{
			System.out.println(j);
			j++;
		}
		while(j<=100);
	}

}
