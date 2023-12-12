package JavaPrograms;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number:");
		int num = sc.nextInt();
		System.out.println("Num: " + num);
		System.out.println("Enter any Name:");
		String name = sc.next();
		System.out.println("Enter Name: "+ name);

	}

}
