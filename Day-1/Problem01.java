// This program calculates the sum of all numbers from 1 to a given number.
import java.util.Scanner;
public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum =0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The result is: " + sum);
        scanner.close();
    }
}