package JavaPrograms;
import java.util.Scanner;
public class IfElseIfStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int marks = sc.nextInt();
		
		if(marks<35)
		{
			System.out.println("Failed");
		}
		
		else if(marks>=35 && marks<=50)
		{
			System.out.println("Average");
		}
		
		else if(marks>=50 && marks<=70)
		{
			System.out.println("Passed");
		}
		
		else if(marks>=70 && marks<=90)
		{
			System.out.println("Top List");
		}
		 
		else if(marks>=90 && marks<=100)
		{
			System.out.println("Distinction");  
		}
		
		else
		{
			System.out.println("Invalid");
		}

	}

}
