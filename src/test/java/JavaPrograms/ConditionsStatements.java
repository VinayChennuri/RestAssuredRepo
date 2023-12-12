package JavaPrograms;
import java.util.Scanner;
public class ConditionsStatements {

	public static void main(String[] args) {
		
		// If-else statement
		
		int a = 10;
		
		if(a%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}

	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any Number: ");
	int b = sc.nextInt();
	if(b%2==0)
	{
		System.out.println("The number is Even");
	}
	else
	{
		System.out.println("The Number is Odd");
	}
	
	}
}
