package JavaPrg;
import java.util.Scanner;

public class AmstrongProg {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    int originalNumber = number;
    int numDigits = (int) Math.log10(number) + 1;
    int sum = 0;

    while (number > 0) {
        int digit = number % 10;
        sum += Math.pow(digit, numDigits);
        number /= 10;
    }

    if (sum == originalNumber) {
        System.out.println(originalNumber + " is an Armstrong number.");
    } else {
        System.out.println(originalNumber + " is not an Armstrong number.");
    }

    scanner.close();
}

	}

