package JavaPrograms;
import java.util.Scanner;

public class SwithCaseStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rank: ");
		int rank = sc.nextInt();
		switch(rank)
		{
		case 1:
		{
			System.out.println("Distinction");
			break;
		}
		case 2:
		{
			System.out.println("Passed");
			break;
		}
		case 3:
		{
			System.out.println("Average");
			break;
		}
		case 4:
		{
			System.out.println("Failed");
			break;
		}
		default	:
		{
			System.out.println("Invalid");
			break;
		}
		}

	}

}
