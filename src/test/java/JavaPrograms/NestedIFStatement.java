package JavaPrograms;
import java.util.Scanner;

public class NestedIFStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter Weight :");
		int weight = sc.nextInt();
		
		if(age>=18)
		{
		if(weight>50)
		{
			System.out.println("The person is eligible to vote");
		}
		else
		{
			System.out.println("The person is not eligible to vote");
		}
	    }
		else
		{
			System.out.println("Sorry age must be greater than 18");
		}
	}
}
